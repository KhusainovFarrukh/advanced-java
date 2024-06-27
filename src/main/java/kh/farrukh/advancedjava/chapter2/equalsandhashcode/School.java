package kh.farrukh.advancedjava.chapter2.equalsandhashcode;

public class School {

  private Integer number;
  private String location;

  public School(Integer number, String location) {
    this.number = number;
    this.location = location;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "School {number=" + number + ", location=" + location + "}";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (this == obj) {
      return true;
    }

    if (getClass() != obj.getClass()) {
      return false;
    }

    final var other = (School) obj;

    if (number == null) {
      if (other.number != null) {
        return false;
      }
    } else if (!number.equals(other.number)) {
      return false;
    }

    if (location == null) {
      if (other.location != null) {
        return false;
      }
    } else if (!location.equals(other.location)) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    final var multiplier = 27;

    var result = 1;
    result = multiplier * result + ((number == null) ? 0 : number.hashCode());
    result = multiplier * result + ((location == null) ? 0 : location.hashCode());

    return result;
  }

}
