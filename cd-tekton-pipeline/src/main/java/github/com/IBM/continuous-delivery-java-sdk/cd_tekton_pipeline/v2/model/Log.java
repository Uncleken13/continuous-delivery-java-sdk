/*
 * (C) Copyright IBM Corp. 2022.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package github.com/IBM/continuous-delivery-java-sdk.cd_tekton_pipeline.v2.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Log object for Tekton pipeline run step.
 */
public class Log extends GenericModel {

  protected String data;
  protected String href;
  protected String id;
  protected String name;

  /**
   * Gets the data.
   *
   * The raw log content of step.
   *
   * @return the data
   */
  public String getData() {
    return data;
  }

  /**
   * Gets the href.
   *
   * API for getting log content.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * Step log ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * &lt;podName&gt;/&lt;containerName&gt; of this log.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

