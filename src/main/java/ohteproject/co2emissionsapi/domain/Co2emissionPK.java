package ohteproject.co2emissionsapi.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Co2emissionPK implements Serializable{

    private String country;
    private int year;

    public Co2emissionPK() {
    }

    public Co2emissionPK(String country, int year) {
        this.country = country;
        this.year = year;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Co2emissionPK that = (Co2emissionPK) o;
        return year == that.year &&
                Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {

        return Objects.hash(country, year);
    }
}
