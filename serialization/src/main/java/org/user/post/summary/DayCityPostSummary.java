/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.user.post.summary;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DayCityPostSummary extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DayCityPostSummary\",\"namespace\":\"org.user.post.summary\",\"fields\":[{\"name\":\"citySummary\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CityPostRecord\",\"fields\":[{\"name\":\"city\",\"type\":\"string\"},{\"name\":\"rank\",\"type\":\"int\"},{\"name\":\"post_count\",\"type\":\"int\"}]}},\"default\":[]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<org.user.post.summary.CityPostRecord> citySummary;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public DayCityPostSummary() {}

  /**
   * All-args constructor.
   */
  public DayCityPostSummary(java.util.List<org.user.post.summary.CityPostRecord> citySummary) {
    this.citySummary = citySummary;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return citySummary;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: citySummary = (java.util.List<org.user.post.summary.CityPostRecord>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'citySummary' field.
   */
  public java.util.List<org.user.post.summary.CityPostRecord> getCitySummary() {
    return citySummary;
  }

  /**
   * Sets the value of the 'citySummary' field.
   * @param value the value to set.
   */
  public void setCitySummary(java.util.List<org.user.post.summary.CityPostRecord> value) {
    this.citySummary = value;
  }

  /** Creates a new DayCityPostSummary RecordBuilder */
  public static org.user.post.summary.DayCityPostSummary.Builder newBuilder() {
    return new org.user.post.summary.DayCityPostSummary.Builder();
  }
  
  /** Creates a new DayCityPostSummary RecordBuilder by copying an existing Builder */
  public static org.user.post.summary.DayCityPostSummary.Builder newBuilder(org.user.post.summary.DayCityPostSummary.Builder other) {
    return new org.user.post.summary.DayCityPostSummary.Builder(other);
  }
  
  /** Creates a new DayCityPostSummary RecordBuilder by copying an existing DayCityPostSummary instance */
  public static org.user.post.summary.DayCityPostSummary.Builder newBuilder(org.user.post.summary.DayCityPostSummary other) {
    return new org.user.post.summary.DayCityPostSummary.Builder(other);
  }
  
  /**
   * RecordBuilder for DayCityPostSummary instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DayCityPostSummary>
    implements org.apache.avro.data.RecordBuilder<DayCityPostSummary> {

    private java.util.List<org.user.post.summary.CityPostRecord> citySummary;

    /** Creates a new Builder */
    private Builder() {
      super(org.user.post.summary.DayCityPostSummary.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.user.post.summary.DayCityPostSummary.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.citySummary)) {
        this.citySummary = data().deepCopy(fields()[0].schema(), other.citySummary);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing DayCityPostSummary instance */
    private Builder(org.user.post.summary.DayCityPostSummary other) {
            super(org.user.post.summary.DayCityPostSummary.SCHEMA$);
      if (isValidValue(fields()[0], other.citySummary)) {
        this.citySummary = data().deepCopy(fields()[0].schema(), other.citySummary);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'citySummary' field */
    public java.util.List<org.user.post.summary.CityPostRecord> getCitySummary() {
      return citySummary;
    }
    
    /** Sets the value of the 'citySummary' field */
    public org.user.post.summary.DayCityPostSummary.Builder setCitySummary(java.util.List<org.user.post.summary.CityPostRecord> value) {
      validate(fields()[0], value);
      this.citySummary = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'citySummary' field has been set */
    public boolean hasCitySummary() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'citySummary' field */
    public org.user.post.summary.DayCityPostSummary.Builder clearCitySummary() {
      citySummary = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public DayCityPostSummary build() {
      try {
        DayCityPostSummary record = new DayCityPostSummary();
        record.citySummary = fieldSetFlags()[0] ? this.citySummary : (java.util.List<org.user.post.summary.CityPostRecord>) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
