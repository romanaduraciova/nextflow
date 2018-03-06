/*
 * workflow_execution.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package nextflow.ga4gh.wes.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * WorkflowRequestObject1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-01T15:34:23.960Z")
public class WorkflowRequestObject1 {
  @SerializedName("workflow_descriptor")
  private String workflowDescriptor = null;

  @SerializedName("workflow_params")
  private String workflowParams = null;

  @SerializedName("workflow_type")
  private String workflowType = null;

  @SerializedName("workflow_type_version")
  private String workflowTypeVersion = null;

  @SerializedName("key_values")
  private Map<String, String> keyValues = null;

  public WorkflowRequestObject1 workflowDescriptor(String workflowDescriptor) {
    this.workflowDescriptor = workflowDescriptor;
    return this;
  }

   /**
   * Get workflowDescriptor
   * @return workflowDescriptor
  **/
  @ApiModelProperty(value = "")
  public String getWorkflowDescriptor() {
    return workflowDescriptor;
  }

  public void setWorkflowDescriptor(String workflowDescriptor) {
    this.workflowDescriptor = workflowDescriptor;
  }

  public WorkflowRequestObject1 workflowParams(String workflowParams) {
    this.workflowParams = workflowParams;
    return this;
  }

   /**
   * Get workflowParams
   * @return workflowParams
  **/
  @ApiModelProperty(value = "")
  public String getWorkflowParams() {
    return workflowParams;
  }

  public void setWorkflowParams(String workflowParams) {
    this.workflowParams = workflowParams;
  }

  public WorkflowRequestObject1 workflowType(String workflowType) {
    this.workflowType = workflowType;
    return this;
  }

   /**
   * Get workflowType
   * @return workflowType
  **/
  @ApiModelProperty(value = "")
  public String getWorkflowType() {
    return workflowType;
  }

  public void setWorkflowType(String workflowType) {
    this.workflowType = workflowType;
  }

  public WorkflowRequestObject1 workflowTypeVersion(String workflowTypeVersion) {
    this.workflowTypeVersion = workflowTypeVersion;
    return this;
  }

   /**
   * Get workflowTypeVersion
   * @return workflowTypeVersion
  **/
  @ApiModelProperty(value = "")
  public String getWorkflowTypeVersion() {
    return workflowTypeVersion;
  }

  public void setWorkflowTypeVersion(String workflowTypeVersion) {
    this.workflowTypeVersion = workflowTypeVersion;
  }

  public WorkflowRequestObject1 keyValues(Map<String, String> keyValues) {
    this.keyValues = keyValues;
    return this;
  }

  public WorkflowRequestObject1 putKeyValuesItem(String key, String keyValuesItem) {
    if (this.keyValues == null) {
      this.keyValues = new HashMap<String, String>();
    }
    this.keyValues.put(key, keyValuesItem);
    return this;
  }

   /**
   * Get keyValues
   * @return keyValues
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getKeyValues() {
    return keyValues;
  }

  public void setKeyValues(Map<String, String> keyValues) {
    this.keyValues = keyValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowRequestObject1 workflowRequestObject1 = (WorkflowRequestObject1) o;
    return Objects.equals(this.workflowDescriptor, workflowRequestObject1.workflowDescriptor) &&
        Objects.equals(this.workflowParams, workflowRequestObject1.workflowParams) &&
        Objects.equals(this.workflowType, workflowRequestObject1.workflowType) &&
        Objects.equals(this.workflowTypeVersion, workflowRequestObject1.workflowTypeVersion) &&
        Objects.equals(this.keyValues, workflowRequestObject1.keyValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowDescriptor, workflowParams, workflowType, workflowTypeVersion, keyValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowRequestObject1 {\n");
    
    sb.append("    workflowDescriptor: ").append(toIndentedString(workflowDescriptor)).append("\n");
    sb.append("    workflowParams: ").append(toIndentedString(workflowParams)).append("\n");
    sb.append("    workflowType: ").append(toIndentedString(workflowType)).append("\n");
    sb.append("    workflowTypeVersion: ").append(toIndentedString(workflowTypeVersion)).append("\n");
    sb.append("    keyValues: ").append(toIndentedString(keyValues)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
