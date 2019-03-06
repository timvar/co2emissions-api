package ohteproject.co2emissionsapi.web;

import ohteproject.co2emissionsapi.domain.Co2emission;
import ohteproject.co2emissionsapi.repository.Co2emissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * REST API emissions/country
 *
 * e.g. emissions/FIN, emissions/SWE,...
 */

@RestController
@RequestMapping("emissions")
public class Co2emissionController {

    @Autowired
    private Co2emissionRepository co2emissionRepository;

    /**
     * GET
     * @param country (FIN, SWE, NOR,...)
     * @return
     */

    @CrossOrigin
    @GetMapping(value = "/{country}", produces = "application/json")
    public Iterable<Co2emission> getCo2emissions(@PathVariable String country) {
        return co2emissionRepository.findAllByCountry(country);
    }

    /**
     * POST
     * @param country (FIN, SWE, NOR,...)
     * @param co2emissions
     * @return
     */

    @CrossOrigin
    @PostMapping("/{country}")
    public Iterable<Co2emission> postCo2emissions(@PathVariable String country, @RequestBody Iterable<Co2emission> co2emissions ) {

        List<Co2emission> co2emissionList = new ArrayList<>();

        for (Co2emission co2emissionItem : co2emissions) {
            Co2emission newCo2emission = new Co2emission();
            newCo2emission.setCountry(country);
            newCo2emission.setCo2emission(co2emissionItem.getCo2emission());
            newCo2emission.setYear((co2emissionItem.getYear()));
            co2emissionList.add(
              co2emissionRepository.save(newCo2emission));
        }

        return co2emissionList;

    }

}
