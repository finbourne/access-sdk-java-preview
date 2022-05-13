/*
 * FINBOURNE Access Management API
 * ### Introduction    This page documents the LUSID Access Management APIs from FINBOURNE Technology, which allow authorised users to query and update their access control policies and roles within the LUSID platform's Identity and Access Management system.    
 *
 * The version of the OpenAPI document: 0.0.1978
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.access.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets DateQuality
 */
@JsonAdapter(DateQuality.Adapter.class)
public enum DateQuality {
  
  UNDEFINED("Undefined"),
  
  ISFIRSTDAYOFANYMONTH("IsFirstDayOfAnyMonth"),
  
  ISLASTDAYOFANYMONTH("IsLastDayOfAnyMonth"),
  
  ISBUSINESSDAYOFANYMONTH("IsBusinessDayOfAnyMonth"),
  
  ISFIRSTDAYOFTHECURRENTMONTH("IsFirstDayOfTheCurrentMonth"),
  
  ISLASTDAYOFTHECURRENTMONTH("IsLastDayOfTheCurrentMonth"),
  
  ISBUSINESSDAYOFTHECURRENTMONTH("IsBusinessDayOfTheCurrentMonth"),
  
  ISBEFOREMIDDAY("IsBeforeMidday"),
  
  ISBEFORE5PM("IsBefore5pm"),
  
  ISAFTER5PM("IsAfter5pm");

  private String value;

  DateQuality(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DateQuality fromValue(String value) {
    for (DateQuality b : DateQuality.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DateQuality> {
    @Override
    public void write(final JsonWriter jsonWriter, final DateQuality enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DateQuality read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DateQuality.fromValue(value);
    }
  }
}

