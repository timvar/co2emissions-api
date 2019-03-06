package ohteproject.co2emissionsapi.web;

import ohteproject.co2emissionsapi.domain.Population;
import ohteproject.co2emissionsapi.repository.PopulationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * REST API populations/country (FIN, SWE, NOR,...)
 *
 * e.g. populations/FIN
 */

@RestController
@RequestMapping("populations")
public class PopulationController {

    @Autowired
    private PopulationRepository populationRepository;

    /**
     * GET
     * @param country (FIN, SWE, NOR,...)
     * @return
     */

    @CrossOrigin
    @GetMapping(value = "/{country}", produces = "application/json")
    public Iterable<Population> getPopulation(@PathVariable String country) {

        return populationRepository.findAllByCountry(country);
    }

    /**
     * POST
     * @param country (FIN, SWE, NOR,...)
     * @param populations
     * @return
     */

    @CrossOrigin
    @PostMapping("/{country}")
    public Iterable<Population> postPopulations( @PathVariable String country, @RequestBody Iterable<Population> populations ) {

        List<Population> populationList = new ArrayList<>();

        for (Population populationItem : populations) {
            Population newPopulation = new Population();
            newPopulation.setCountry(country);
            newPopulation.setPopulation(populationItem.getPopulation());
            newPopulation.setYear((populationItem.getYear()));
            populationList.add(
                    populationRepository.save(newPopulation));
        }

        return populationList;
    }
}
