/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.medineceylan.kafkaexamples.models;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public enum TransactionType {
  OPENING, WITHDRAW, DEPOSIT  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"TransactionType\",\"namespace\":\"com.medineceylan.kafkaexamples.models\",\"symbols\":[\"OPENING\",\"WITHDRAW\",\"DEPOSIT\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}
