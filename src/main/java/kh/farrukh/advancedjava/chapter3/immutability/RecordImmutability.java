package kh.farrukh.advancedjava.chapter3.immutability;

import java.util.List;

public record RecordImmutability(
    String fullName,
    List<String> emails,
    IDCard idCard
) {

}
