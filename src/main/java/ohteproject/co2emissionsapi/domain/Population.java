package ohteproject.co2emissionsapi.domain;

import javax.persistence.*;

@Entity
@IdClass(PopulationPK.class)
public class Population {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private Long populationId;
    @Id
    private String country;
    @Id
    private int year;
    private Long population;

    public Population() {
    }


    public Population(String country, int year, Long population) {
        this.country = country;
        this.year = year;
        this.population = population;
    }

/*
    public Long getPopulationId() {
        return populationId;
    }

    public void setPopulationId(Long populationId) {
        this.populationId = populationId;
    }
*/

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }
}
