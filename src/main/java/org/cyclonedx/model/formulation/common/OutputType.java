package org.cyclonedx.model.formulation.common;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.cyclonedx.util.deserializer.OutputTypeDeserializer;

@JsonDeserialize(using = OutputTypeDeserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({"type", "source", "target", "resource", "environmentVars", "data", "properties"})
public class OutputType extends AbstractType
{
  private String type;

  public String getType() {
    return type;
  }

  public void setType(final String type) {
    this.type = type;
  }
}
