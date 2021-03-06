// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/policy.proto

package com.google.ads.googleads.v1.common;

/**
 * <pre>
 * Key of the violation. The key is used for referring to a violation
 * when filing an exemption request.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.common.PolicyViolationKey}
 */
public final class PolicyViolationKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.common.PolicyViolationKey)
    PolicyViolationKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PolicyViolationKey.newBuilder() to construct.
  private PolicyViolationKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PolicyViolationKey() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PolicyViolationKey();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PolicyViolationKey(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (policyName_ != null) {
              subBuilder = policyName_.toBuilder();
            }
            policyName_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(policyName_);
              policyName_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (violatingText_ != null) {
              subBuilder = violatingText_.toBuilder();
            }
            violatingText_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(violatingText_);
              violatingText_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v1.common.PolicyProto.internal_static_google_ads_googleads_v1_common_PolicyViolationKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.common.PolicyProto.internal_static_google_ads_googleads_v1_common_PolicyViolationKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.common.PolicyViolationKey.class, com.google.ads.googleads.v1.common.PolicyViolationKey.Builder.class);
  }

  public static final int POLICY_NAME_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue policyName_;
  /**
   * <pre>
   * Unique ID of the violated policy.
   * </pre>
   *
   * <code>.google.protobuf.StringValue policy_name = 1;</code>
   * @return Whether the policyName field is set.
   */
  @java.lang.Override
  public boolean hasPolicyName() {
    return policyName_ != null;
  }
  /**
   * <pre>
   * Unique ID of the violated policy.
   * </pre>
   *
   * <code>.google.protobuf.StringValue policy_name = 1;</code>
   * @return The policyName.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getPolicyName() {
    return policyName_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : policyName_;
  }
  /**
   * <pre>
   * Unique ID of the violated policy.
   * </pre>
   *
   * <code>.google.protobuf.StringValue policy_name = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getPolicyNameOrBuilder() {
    return getPolicyName();
  }

  public static final int VIOLATING_TEXT_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue violatingText_;
  /**
   * <pre>
   * The text that violates the policy if specified.
   * Otherwise, refers to the policy in general
   * (e.g., when requesting to be exempt from the whole policy).
   * If not specified for criterion exemptions, the whole policy is implied.
   * Must be specified for ad exemptions.
   * </pre>
   *
   * <code>.google.protobuf.StringValue violating_text = 2;</code>
   * @return Whether the violatingText field is set.
   */
  @java.lang.Override
  public boolean hasViolatingText() {
    return violatingText_ != null;
  }
  /**
   * <pre>
   * The text that violates the policy if specified.
   * Otherwise, refers to the policy in general
   * (e.g., when requesting to be exempt from the whole policy).
   * If not specified for criterion exemptions, the whole policy is implied.
   * Must be specified for ad exemptions.
   * </pre>
   *
   * <code>.google.protobuf.StringValue violating_text = 2;</code>
   * @return The violatingText.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getViolatingText() {
    return violatingText_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : violatingText_;
  }
  /**
   * <pre>
   * The text that violates the policy if specified.
   * Otherwise, refers to the policy in general
   * (e.g., when requesting to be exempt from the whole policy).
   * If not specified for criterion exemptions, the whole policy is implied.
   * Must be specified for ad exemptions.
   * </pre>
   *
   * <code>.google.protobuf.StringValue violating_text = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getViolatingTextOrBuilder() {
    return getViolatingText();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (policyName_ != null) {
      output.writeMessage(1, getPolicyName());
    }
    if (violatingText_ != null) {
      output.writeMessage(2, getViolatingText());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (policyName_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPolicyName());
    }
    if (violatingText_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getViolatingText());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v1.common.PolicyViolationKey)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.common.PolicyViolationKey other = (com.google.ads.googleads.v1.common.PolicyViolationKey) obj;

    if (hasPolicyName() != other.hasPolicyName()) return false;
    if (hasPolicyName()) {
      if (!getPolicyName()
          .equals(other.getPolicyName())) return false;
    }
    if (hasViolatingText() != other.hasViolatingText()) return false;
    if (hasViolatingText()) {
      if (!getViolatingText()
          .equals(other.getViolatingText())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPolicyName()) {
      hash = (37 * hash) + POLICY_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getPolicyName().hashCode();
    }
    if (hasViolatingText()) {
      hash = (37 * hash) + VIOLATING_TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getViolatingText().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.common.PolicyViolationKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.PolicyViolationKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.PolicyViolationKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.PolicyViolationKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.PolicyViolationKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.PolicyViolationKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.PolicyViolationKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.PolicyViolationKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.PolicyViolationKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.PolicyViolationKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.PolicyViolationKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.PolicyViolationKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v1.common.PolicyViolationKey prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Key of the violation. The key is used for referring to a violation
   * when filing an exemption request.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.common.PolicyViolationKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.common.PolicyViolationKey)
      com.google.ads.googleads.v1.common.PolicyViolationKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.common.PolicyProto.internal_static_google_ads_googleads_v1_common_PolicyViolationKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.common.PolicyProto.internal_static_google_ads_googleads_v1_common_PolicyViolationKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.common.PolicyViolationKey.class, com.google.ads.googleads.v1.common.PolicyViolationKey.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.common.PolicyViolationKey.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (policyNameBuilder_ == null) {
        policyName_ = null;
      } else {
        policyName_ = null;
        policyNameBuilder_ = null;
      }
      if (violatingTextBuilder_ == null) {
        violatingText_ = null;
      } else {
        violatingText_ = null;
        violatingTextBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.common.PolicyProto.internal_static_google_ads_googleads_v1_common_PolicyViolationKey_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.PolicyViolationKey getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.common.PolicyViolationKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.PolicyViolationKey build() {
      com.google.ads.googleads.v1.common.PolicyViolationKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.PolicyViolationKey buildPartial() {
      com.google.ads.googleads.v1.common.PolicyViolationKey result = new com.google.ads.googleads.v1.common.PolicyViolationKey(this);
      if (policyNameBuilder_ == null) {
        result.policyName_ = policyName_;
      } else {
        result.policyName_ = policyNameBuilder_.build();
      }
      if (violatingTextBuilder_ == null) {
        result.violatingText_ = violatingText_;
      } else {
        result.violatingText_ = violatingTextBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v1.common.PolicyViolationKey) {
        return mergeFrom((com.google.ads.googleads.v1.common.PolicyViolationKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.common.PolicyViolationKey other) {
      if (other == com.google.ads.googleads.v1.common.PolicyViolationKey.getDefaultInstance()) return this;
      if (other.hasPolicyName()) {
        mergePolicyName(other.getPolicyName());
      }
      if (other.hasViolatingText()) {
        mergeViolatingText(other.getViolatingText());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v1.common.PolicyViolationKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.common.PolicyViolationKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue policyName_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> policyNameBuilder_;
    /**
     * <pre>
     * Unique ID of the violated policy.
     * </pre>
     *
     * <code>.google.protobuf.StringValue policy_name = 1;</code>
     * @return Whether the policyName field is set.
     */
    public boolean hasPolicyName() {
      return policyNameBuilder_ != null || policyName_ != null;
    }
    /**
     * <pre>
     * Unique ID of the violated policy.
     * </pre>
     *
     * <code>.google.protobuf.StringValue policy_name = 1;</code>
     * @return The policyName.
     */
    public com.google.protobuf.StringValue getPolicyName() {
      if (policyNameBuilder_ == null) {
        return policyName_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : policyName_;
      } else {
        return policyNameBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Unique ID of the violated policy.
     * </pre>
     *
     * <code>.google.protobuf.StringValue policy_name = 1;</code>
     */
    public Builder setPolicyName(com.google.protobuf.StringValue value) {
      if (policyNameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policyName_ = value;
        onChanged();
      } else {
        policyNameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Unique ID of the violated policy.
     * </pre>
     *
     * <code>.google.protobuf.StringValue policy_name = 1;</code>
     */
    public Builder setPolicyName(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (policyNameBuilder_ == null) {
        policyName_ = builderForValue.build();
        onChanged();
      } else {
        policyNameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Unique ID of the violated policy.
     * </pre>
     *
     * <code>.google.protobuf.StringValue policy_name = 1;</code>
     */
    public Builder mergePolicyName(com.google.protobuf.StringValue value) {
      if (policyNameBuilder_ == null) {
        if (policyName_ != null) {
          policyName_ =
            com.google.protobuf.StringValue.newBuilder(policyName_).mergeFrom(value).buildPartial();
        } else {
          policyName_ = value;
        }
        onChanged();
      } else {
        policyNameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Unique ID of the violated policy.
     * </pre>
     *
     * <code>.google.protobuf.StringValue policy_name = 1;</code>
     */
    public Builder clearPolicyName() {
      if (policyNameBuilder_ == null) {
        policyName_ = null;
        onChanged();
      } else {
        policyName_ = null;
        policyNameBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Unique ID of the violated policy.
     * </pre>
     *
     * <code>.google.protobuf.StringValue policy_name = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getPolicyNameBuilder() {
      
      onChanged();
      return getPolicyNameFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Unique ID of the violated policy.
     * </pre>
     *
     * <code>.google.protobuf.StringValue policy_name = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getPolicyNameOrBuilder() {
      if (policyNameBuilder_ != null) {
        return policyNameBuilder_.getMessageOrBuilder();
      } else {
        return policyName_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : policyName_;
      }
    }
    /**
     * <pre>
     * Unique ID of the violated policy.
     * </pre>
     *
     * <code>.google.protobuf.StringValue policy_name = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getPolicyNameFieldBuilder() {
      if (policyNameBuilder_ == null) {
        policyNameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getPolicyName(),
                getParentForChildren(),
                isClean());
        policyName_ = null;
      }
      return policyNameBuilder_;
    }

    private com.google.protobuf.StringValue violatingText_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> violatingTextBuilder_;
    /**
     * <pre>
     * The text that violates the policy if specified.
     * Otherwise, refers to the policy in general
     * (e.g., when requesting to be exempt from the whole policy).
     * If not specified for criterion exemptions, the whole policy is implied.
     * Must be specified for ad exemptions.
     * </pre>
     *
     * <code>.google.protobuf.StringValue violating_text = 2;</code>
     * @return Whether the violatingText field is set.
     */
    public boolean hasViolatingText() {
      return violatingTextBuilder_ != null || violatingText_ != null;
    }
    /**
     * <pre>
     * The text that violates the policy if specified.
     * Otherwise, refers to the policy in general
     * (e.g., when requesting to be exempt from the whole policy).
     * If not specified for criterion exemptions, the whole policy is implied.
     * Must be specified for ad exemptions.
     * </pre>
     *
     * <code>.google.protobuf.StringValue violating_text = 2;</code>
     * @return The violatingText.
     */
    public com.google.protobuf.StringValue getViolatingText() {
      if (violatingTextBuilder_ == null) {
        return violatingText_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : violatingText_;
      } else {
        return violatingTextBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The text that violates the policy if specified.
     * Otherwise, refers to the policy in general
     * (e.g., when requesting to be exempt from the whole policy).
     * If not specified for criterion exemptions, the whole policy is implied.
     * Must be specified for ad exemptions.
     * </pre>
     *
     * <code>.google.protobuf.StringValue violating_text = 2;</code>
     */
    public Builder setViolatingText(com.google.protobuf.StringValue value) {
      if (violatingTextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        violatingText_ = value;
        onChanged();
      } else {
        violatingTextBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The text that violates the policy if specified.
     * Otherwise, refers to the policy in general
     * (e.g., when requesting to be exempt from the whole policy).
     * If not specified for criterion exemptions, the whole policy is implied.
     * Must be specified for ad exemptions.
     * </pre>
     *
     * <code>.google.protobuf.StringValue violating_text = 2;</code>
     */
    public Builder setViolatingText(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (violatingTextBuilder_ == null) {
        violatingText_ = builderForValue.build();
        onChanged();
      } else {
        violatingTextBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The text that violates the policy if specified.
     * Otherwise, refers to the policy in general
     * (e.g., when requesting to be exempt from the whole policy).
     * If not specified for criterion exemptions, the whole policy is implied.
     * Must be specified for ad exemptions.
     * </pre>
     *
     * <code>.google.protobuf.StringValue violating_text = 2;</code>
     */
    public Builder mergeViolatingText(com.google.protobuf.StringValue value) {
      if (violatingTextBuilder_ == null) {
        if (violatingText_ != null) {
          violatingText_ =
            com.google.protobuf.StringValue.newBuilder(violatingText_).mergeFrom(value).buildPartial();
        } else {
          violatingText_ = value;
        }
        onChanged();
      } else {
        violatingTextBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The text that violates the policy if specified.
     * Otherwise, refers to the policy in general
     * (e.g., when requesting to be exempt from the whole policy).
     * If not specified for criterion exemptions, the whole policy is implied.
     * Must be specified for ad exemptions.
     * </pre>
     *
     * <code>.google.protobuf.StringValue violating_text = 2;</code>
     */
    public Builder clearViolatingText() {
      if (violatingTextBuilder_ == null) {
        violatingText_ = null;
        onChanged();
      } else {
        violatingText_ = null;
        violatingTextBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The text that violates the policy if specified.
     * Otherwise, refers to the policy in general
     * (e.g., when requesting to be exempt from the whole policy).
     * If not specified for criterion exemptions, the whole policy is implied.
     * Must be specified for ad exemptions.
     * </pre>
     *
     * <code>.google.protobuf.StringValue violating_text = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getViolatingTextBuilder() {
      
      onChanged();
      return getViolatingTextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The text that violates the policy if specified.
     * Otherwise, refers to the policy in general
     * (e.g., when requesting to be exempt from the whole policy).
     * If not specified for criterion exemptions, the whole policy is implied.
     * Must be specified for ad exemptions.
     * </pre>
     *
     * <code>.google.protobuf.StringValue violating_text = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getViolatingTextOrBuilder() {
      if (violatingTextBuilder_ != null) {
        return violatingTextBuilder_.getMessageOrBuilder();
      } else {
        return violatingText_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : violatingText_;
      }
    }
    /**
     * <pre>
     * The text that violates the policy if specified.
     * Otherwise, refers to the policy in general
     * (e.g., when requesting to be exempt from the whole policy).
     * If not specified for criterion exemptions, the whole policy is implied.
     * Must be specified for ad exemptions.
     * </pre>
     *
     * <code>.google.protobuf.StringValue violating_text = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getViolatingTextFieldBuilder() {
      if (violatingTextBuilder_ == null) {
        violatingTextBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getViolatingText(),
                getParentForChildren(),
                isClean());
        violatingText_ = null;
      }
      return violatingTextBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.common.PolicyViolationKey)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.common.PolicyViolationKey)
  private static final com.google.ads.googleads.v1.common.PolicyViolationKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.common.PolicyViolationKey();
  }

  public static com.google.ads.googleads.v1.common.PolicyViolationKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PolicyViolationKey>
      PARSER = new com.google.protobuf.AbstractParser<PolicyViolationKey>() {
    @java.lang.Override
    public PolicyViolationKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PolicyViolationKey(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PolicyViolationKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PolicyViolationKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.common.PolicyViolationKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

