/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v1.services;

import com.google.ads.googleads.v1.resources.KeywordPlanKeyword;
import com.google.ads.googleads.v1.services.stub.KeywordPlanKeywordServiceStub;
import com.google.ads.googleads.v1.services.stub.KeywordPlanKeywordServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Service to manage Keyword Plan ad group keywords.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (KeywordPlanKeywordServiceClient keywordPlanKeywordServiceClient = KeywordPlanKeywordServiceClient.create()) {
 *   KeywordPlanKeywordName resourceName = KeywordPlanKeywordName.of("[CUSTOMER]", "[KEYWORD_PLAN_KEYWORD]");
 *   KeywordPlanKeyword response = keywordPlanKeywordServiceClient.getKeywordPlanKeyword(resourceName);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the keywordPlanKeywordServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of
 * KeywordPlanKeywordServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * KeywordPlanKeywordServiceSettings keywordPlanKeywordServiceSettings =
 *     KeywordPlanKeywordServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * KeywordPlanKeywordServiceClient keywordPlanKeywordServiceClient =
 *     KeywordPlanKeywordServiceClient.create(keywordPlanKeywordServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * KeywordPlanKeywordServiceSettings keywordPlanKeywordServiceSettings =
 *     KeywordPlanKeywordServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * KeywordPlanKeywordServiceClient keywordPlanKeywordServiceClient =
 *     KeywordPlanKeywordServiceClient.create(keywordPlanKeywordServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class KeywordPlanKeywordServiceClient implements BackgroundResource {
  private final KeywordPlanKeywordServiceSettings settings;
  private final KeywordPlanKeywordServiceStub stub;

  /** Constructs an instance of KeywordPlanKeywordServiceClient with default settings. */
  public static final KeywordPlanKeywordServiceClient create() throws IOException {
    return create(KeywordPlanKeywordServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of KeywordPlanKeywordServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final KeywordPlanKeywordServiceClient create(
      KeywordPlanKeywordServiceSettings settings) throws IOException {
    return new KeywordPlanKeywordServiceClient(settings);
  }

  /**
   * Constructs an instance of KeywordPlanKeywordServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use KeywordPlanKeywordServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final KeywordPlanKeywordServiceClient create(KeywordPlanKeywordServiceStub stub) {
    return new KeywordPlanKeywordServiceClient(stub);
  }

  /**
   * Constructs an instance of KeywordPlanKeywordServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected KeywordPlanKeywordServiceClient(KeywordPlanKeywordServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((KeywordPlanKeywordServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected KeywordPlanKeywordServiceClient(KeywordPlanKeywordServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final KeywordPlanKeywordServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public KeywordPlanKeywordServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan keyword in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanKeywordServiceClient keywordPlanKeywordServiceClient = KeywordPlanKeywordServiceClient.create()) {
   *   KeywordPlanKeywordName resourceName = KeywordPlanKeywordName.of("[CUSTOMER]", "[KEYWORD_PLAN_KEYWORD]");
   *   KeywordPlanKeyword response = keywordPlanKeywordServiceClient.getKeywordPlanKeyword(resourceName);
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the ad group keyword to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlanKeyword getKeywordPlanKeyword(KeywordPlanKeywordName resourceName) {
    GetKeywordPlanKeywordRequest request =
        GetKeywordPlanKeywordRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getKeywordPlanKeyword(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan keyword in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanKeywordServiceClient keywordPlanKeywordServiceClient = KeywordPlanKeywordServiceClient.create()) {
   *   KeywordPlanKeywordName resourceName = KeywordPlanKeywordName.of("[CUSTOMER]", "[KEYWORD_PLAN_KEYWORD]");
   *   KeywordPlanKeyword response = keywordPlanKeywordServiceClient.getKeywordPlanKeyword(resourceName.toString());
   * }
   * </code></pre>
   *
   * @param resourceName Required. The resource name of the ad group keyword to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlanKeyword getKeywordPlanKeyword(String resourceName) {
    GetKeywordPlanKeywordRequest request =
        GetKeywordPlanKeywordRequest.newBuilder().setResourceName(resourceName).build();
    return getKeywordPlanKeyword(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan keyword in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanKeywordServiceClient keywordPlanKeywordServiceClient = KeywordPlanKeywordServiceClient.create()) {
   *   KeywordPlanKeywordName resourceName = KeywordPlanKeywordName.of("[CUSTOMER]", "[KEYWORD_PLAN_KEYWORD]");
   *   GetKeywordPlanKeywordRequest request = GetKeywordPlanKeywordRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   KeywordPlanKeyword response = keywordPlanKeywordServiceClient.getKeywordPlanKeyword(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final KeywordPlanKeyword getKeywordPlanKeyword(GetKeywordPlanKeywordRequest request) {
    return getKeywordPlanKeywordCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Returns the requested Keyword Plan keyword in full detail.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanKeywordServiceClient keywordPlanKeywordServiceClient = KeywordPlanKeywordServiceClient.create()) {
   *   KeywordPlanKeywordName resourceName = KeywordPlanKeywordName.of("[CUSTOMER]", "[KEYWORD_PLAN_KEYWORD]");
   *   GetKeywordPlanKeywordRequest request = GetKeywordPlanKeywordRequest.newBuilder()
   *     .setResourceName(resourceName.toString())
   *     .build();
   *   ApiFuture&lt;KeywordPlanKeyword&gt; future = keywordPlanKeywordServiceClient.getKeywordPlanKeywordCallable().futureCall(request);
   *   // Do something
   *   KeywordPlanKeyword response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetKeywordPlanKeywordRequest, KeywordPlanKeyword>
      getKeywordPlanKeywordCallable() {
    return stub.getKeywordPlanKeywordCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes Keyword Plan keywords. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanKeywordServiceClient keywordPlanKeywordServiceClient = KeywordPlanKeywordServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanKeywordOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateKeywordPlanKeywordsResponse response = keywordPlanKeywordServiceClient.mutateKeywordPlanKeywords(customerId, operations);
   * }
   * </code></pre>
   *
   * @param customerId Required. The ID of the customer whose Keyword Plan keywords are being
   *     modified.
   * @param operations Required. The list of operations to perform on individual Keyword Plan
   *     keywords.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlanKeywordsResponse mutateKeywordPlanKeywords(
      String customerId, List<KeywordPlanKeywordOperation> operations) {
    MutateKeywordPlanKeywordsRequest request =
        MutateKeywordPlanKeywordsRequest.newBuilder()
            .setCustomerId(customerId)
            .addAllOperations(operations)
            .build();
    return mutateKeywordPlanKeywords(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes Keyword Plan keywords. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanKeywordServiceClient keywordPlanKeywordServiceClient = KeywordPlanKeywordServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanKeywordOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateKeywordPlanKeywordsRequest request = MutateKeywordPlanKeywordsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   MutateKeywordPlanKeywordsResponse response = keywordPlanKeywordServiceClient.mutateKeywordPlanKeywords(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MutateKeywordPlanKeywordsResponse mutateKeywordPlanKeywords(
      MutateKeywordPlanKeywordsRequest request) {
    return mutateKeywordPlanKeywordsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates, updates, or removes Keyword Plan keywords. Operation statuses are returned.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (KeywordPlanKeywordServiceClient keywordPlanKeywordServiceClient = KeywordPlanKeywordServiceClient.create()) {
   *   String customerId = "";
   *   List&lt;KeywordPlanKeywordOperation&gt; operations = new ArrayList&lt;&gt;();
   *   MutateKeywordPlanKeywordsRequest request = MutateKeywordPlanKeywordsRequest.newBuilder()
   *     .setCustomerId(customerId)
   *     .addAllOperations(operations)
   *     .build();
   *   ApiFuture&lt;MutateKeywordPlanKeywordsResponse&gt; future = keywordPlanKeywordServiceClient.mutateKeywordPlanKeywordsCallable().futureCall(request);
   *   // Do something
   *   MutateKeywordPlanKeywordsResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<MutateKeywordPlanKeywordsRequest, MutateKeywordPlanKeywordsResponse>
      mutateKeywordPlanKeywordsCallable() {
    return stub.mutateKeywordPlanKeywordsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
