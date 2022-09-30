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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Pipeline definitions is a collection of individual definition entries, each entry consists of a repository URL,
 * branch/tag and path.
 */
public class DefinitionsCollection extends GenericModel {

  protected List<DefinitionsCollectionDefinitionsItem> definitions;

  /**
   * Gets the definitions.
   *
   * Definition list.
   *
   * @return the definitions
   */
  public List<DefinitionsCollectionDefinitionsItem> getDefinitions() {
    return definitions;
  }
}

