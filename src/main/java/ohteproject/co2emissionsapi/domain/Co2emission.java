package ohteproject.co2emissionsapi.domain;

import javax.persistence.*;

@Entity
@IdClass(Co2emissionPK.class)
public class Co2emission {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private Long emissionId;
    @Id
    private String country;
    @Id
    private int year;
    private double co2emission;

    public Co2emission() {
    }

    public Co2emission(int year, double co2emission) {
        this.year = year;
        this.co2emission = co2emission;
    }

    public Co2emission(String country, int year, double co2emission) {
        this.country = country;
        this.year = year;
        this.co2emission = co2emission;
    }

    /*
    public Long getEmissionId() {
        return emissionId;
    }

    public void setEmissionId(Long emissionId) {
        this.emissionId = emissionId;
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

    public double getCo2emission() {
        return co2emission;
    }

    public void setCo2emission(double co2emission) {
        this.co2emission = co2emission;
    }
}
