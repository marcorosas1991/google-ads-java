// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/simulation.proto

package com.google.ads.googleads.v1.common;

/**
 * <pre>
 * Projected metrics for a specific CPV bid amount.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.common.CpvBidSimulationPoint}
 */
public final class CpvBidSimulationPoint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.common.CpvBidSimulationPoint)
    CpvBidSimulationPointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CpvBidSimulationPoint.newBuilder() to construct.
  private CpvBidSimulationPoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CpvBidSimulationPoint() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CpvBidSimulationPoint();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CpvBidSimulationPoint(
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
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (cpvBidMicros_ != null) {
              subBuilder = cpvBidMicros_.toBuilder();
            }
            cpvBidMicros_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cpvBidMicros_);
              cpvBidMicros_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (costMicros_ != null) {
              subBuilder = costMicros_.toBuilder();
            }
            costMicros_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(costMicros_);
              costMicros_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (impressions_ != null) {
              subBuilder = impressions_.toBuilder();
            }
            impressions_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(impressions_);
              impressions_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v1.common.SimulationProto.internal_static_google_ads_googleads_v1_common_CpvBidSimulationPoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.common.SimulationProto.internal_static_google_ads_googleads_v1_common_CpvBidSimulationPoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.common.CpvBidSimulationPoint.class, com.google.ads.googleads.v1.common.CpvBidSimulationPoint.Builder.class);
  }

  public static final int CPV_BID_MICROS_FIELD_NUMBER = 1;
  private com.google.protobuf.Int64Value cpvBidMicros_;
  /**
   * <pre>
   * The simulated CPV bid upon which projected metrics are based.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpv_bid_micros = 1;</code>
   * @return Whether the cpvBidMicros field is set.
   */
  @java.lang.Override
  public boolean hasCpvBidMicros() {
    return cpvBidMicros_ != null;
  }
  /**
   * <pre>
   * The simulated CPV bid upon which projected metrics are based.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpv_bid_micros = 1;</code>
   * @return The cpvBidMicros.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getCpvBidMicros() {
    return cpvBidMicros_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : cpvBidMicros_;
  }
  /**
   * <pre>
   * The simulated CPV bid upon which projected metrics are based.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpv_bid_micros = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getCpvBidMicrosOrBuilder() {
    return getCpvBidMicros();
  }

  public static final int COST_MICROS_FIELD_NUMBER = 2;
  private com.google.protobuf.Int64Value costMicros_;
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cost_micros = 2;</code>
   * @return Whether the costMicros field is set.
   */
  @java.lang.Override
  public boolean hasCostMicros() {
    return costMicros_ != null;
  }
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cost_micros = 2;</code>
   * @return The costMicros.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getCostMicros() {
    return costMicros_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : costMicros_;
  }
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cost_micros = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getCostMicrosOrBuilder() {
    return getCostMicros();
  }

  public static final int IMPRESSIONS_FIELD_NUMBER = 3;
  private com.google.protobuf.Int64Value impressions_;
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value impressions = 3;</code>
   * @return Whether the impressions field is set.
   */
  @java.lang.Override
  public boolean hasImpressions() {
    return impressions_ != null;
  }
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value impressions = 3;</code>
   * @return The impressions.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getImpressions() {
    return impressions_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : impressions_;
  }
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value impressions = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getImpressionsOrBuilder() {
    return getImpressions();
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
    if (cpvBidMicros_ != null) {
      output.writeMessage(1, getCpvBidMicros());
    }
    if (costMicros_ != null) {
      output.writeMessage(2, getCostMicros());
    }
    if (impressions_ != null) {
      output.writeMessage(3, getImpressions());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cpvBidMicros_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCpvBidMicros());
    }
    if (costMicros_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCostMicros());
    }
    if (impressions_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getImpressions());
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
    if (!(obj instanceof com.google.ads.googleads.v1.common.CpvBidSimulationPoint)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.common.CpvBidSimulationPoint other = (com.google.ads.googleads.v1.common.CpvBidSimulationPoint) obj;

    if (hasCpvBidMicros() != other.hasCpvBidMicros()) return false;
    if (hasCpvBidMicros()) {
      if (!getCpvBidMicros()
          .equals(other.getCpvBidMicros())) return false;
    }
    if (hasCostMicros() != other.hasCostMicros()) return false;
    if (hasCostMicros()) {
      if (!getCostMicros()
          .equals(other.getCostMicros())) return false;
    }
    if (hasImpressions() != other.hasImpressions()) return false;
    if (hasImpressions()) {
      if (!getImpressions()
          .equals(other.getImpressions())) return false;
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
    if (hasCpvBidMicros()) {
      hash = (37 * hash) + CPV_BID_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + getCpvBidMicros().hashCode();
    }
    if (hasCostMicros()) {
      hash = (37 * hash) + COST_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + getCostMicros().hashCode();
    }
    if (hasImpressions()) {
      hash = (37 * hash) + IMPRESSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getImpressions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.common.CpvBidSimulationPoint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.CpvBidSimulationPoint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.CpvBidSimulationPoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.CpvBidSimulationPoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.CpvBidSimulationPoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.CpvBidSimulationPoint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.CpvBidSimulationPoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.CpvBidSimulationPoint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.CpvBidSimulationPoint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.CpvBidSimulationPoint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.CpvBidSimulationPoint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.CpvBidSimulationPoint parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.common.CpvBidSimulationPoint prototype) {
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
   * Projected metrics for a specific CPV bid amount.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.common.CpvBidSimulationPoint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.common.CpvBidSimulationPoint)
      com.google.ads.googleads.v1.common.CpvBidSimulationPointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.common.SimulationProto.internal_static_google_ads_googleads_v1_common_CpvBidSimulationPoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.common.SimulationProto.internal_static_google_ads_googleads_v1_common_CpvBidSimulationPoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.common.CpvBidSimulationPoint.class, com.google.ads.googleads.v1.common.CpvBidSimulationPoint.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.common.CpvBidSimulationPoint.newBuilder()
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
      if (cpvBidMicrosBuilder_ == null) {
        cpvBidMicros_ = null;
      } else {
        cpvBidMicros_ = null;
        cpvBidMicrosBuilder_ = null;
      }
      if (costMicrosBuilder_ == null) {
        costMicros_ = null;
      } else {
        costMicros_ = null;
        costMicrosBuilder_ = null;
      }
      if (impressionsBuilder_ == null) {
        impressions_ = null;
      } else {
        impressions_ = null;
        impressionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.common.SimulationProto.internal_static_google_ads_googleads_v1_common_CpvBidSimulationPoint_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.CpvBidSimulationPoint getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.common.CpvBidSimulationPoint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.CpvBidSimulationPoint build() {
      com.google.ads.googleads.v1.common.CpvBidSimulationPoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.CpvBidSimulationPoint buildPartial() {
      com.google.ads.googleads.v1.common.CpvBidSimulationPoint result = new com.google.ads.googleads.v1.common.CpvBidSimulationPoint(this);
      if (cpvBidMicrosBuilder_ == null) {
        result.cpvBidMicros_ = cpvBidMicros_;
      } else {
        result.cpvBidMicros_ = cpvBidMicrosBuilder_.build();
      }
      if (costMicrosBuilder_ == null) {
        result.costMicros_ = costMicros_;
      } else {
        result.costMicros_ = costMicrosBuilder_.build();
      }
      if (impressionsBuilder_ == null) {
        result.impressions_ = impressions_;
      } else {
        result.impressions_ = impressionsBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v1.common.CpvBidSimulationPoint) {
        return mergeFrom((com.google.ads.googleads.v1.common.CpvBidSimulationPoint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.common.CpvBidSimulationPoint other) {
      if (other == com.google.ads.googleads.v1.common.CpvBidSimulationPoint.getDefaultInstance()) return this;
      if (other.hasCpvBidMicros()) {
        mergeCpvBidMicros(other.getCpvBidMicros());
      }
      if (other.hasCostMicros()) {
        mergeCostMicros(other.getCostMicros());
      }
      if (other.hasImpressions()) {
        mergeImpressions(other.getImpressions());
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
      com.google.ads.googleads.v1.common.CpvBidSimulationPoint parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.common.CpvBidSimulationPoint) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Int64Value cpvBidMicros_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> cpvBidMicrosBuilder_;
    /**
     * <pre>
     * The simulated CPV bid upon which projected metrics are based.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpv_bid_micros = 1;</code>
     * @return Whether the cpvBidMicros field is set.
     */
    public boolean hasCpvBidMicros() {
      return cpvBidMicrosBuilder_ != null || cpvBidMicros_ != null;
    }
    /**
     * <pre>
     * The simulated CPV bid upon which projected metrics are based.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpv_bid_micros = 1;</code>
     * @return The cpvBidMicros.
     */
    public com.google.protobuf.Int64Value getCpvBidMicros() {
      if (cpvBidMicrosBuilder_ == null) {
        return cpvBidMicros_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : cpvBidMicros_;
      } else {
        return cpvBidMicrosBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The simulated CPV bid upon which projected metrics are based.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpv_bid_micros = 1;</code>
     */
    public Builder setCpvBidMicros(com.google.protobuf.Int64Value value) {
      if (cpvBidMicrosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cpvBidMicros_ = value;
        onChanged();
      } else {
        cpvBidMicrosBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The simulated CPV bid upon which projected metrics are based.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpv_bid_micros = 1;</code>
     */
    public Builder setCpvBidMicros(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (cpvBidMicrosBuilder_ == null) {
        cpvBidMicros_ = builderForValue.build();
        onChanged();
      } else {
        cpvBidMicrosBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The simulated CPV bid upon which projected metrics are based.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpv_bid_micros = 1;</code>
     */
    public Builder mergeCpvBidMicros(com.google.protobuf.Int64Value value) {
      if (cpvBidMicrosBuilder_ == null) {
        if (cpvBidMicros_ != null) {
          cpvBidMicros_ =
            com.google.protobuf.Int64Value.newBuilder(cpvBidMicros_).mergeFrom(value).buildPartial();
        } else {
          cpvBidMicros_ = value;
        }
        onChanged();
      } else {
        cpvBidMicrosBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The simulated CPV bid upon which projected metrics are based.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpv_bid_micros = 1;</code>
     */
    public Builder clearCpvBidMicros() {
      if (cpvBidMicrosBuilder_ == null) {
        cpvBidMicros_ = null;
        onChanged();
      } else {
        cpvBidMicros_ = null;
        cpvBidMicrosBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The simulated CPV bid upon which projected metrics are based.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpv_bid_micros = 1;</code>
     */
    public com.google.protobuf.Int64Value.Builder getCpvBidMicrosBuilder() {
      
      onChanged();
      return getCpvBidMicrosFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The simulated CPV bid upon which projected metrics are based.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpv_bid_micros = 1;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getCpvBidMicrosOrBuilder() {
      if (cpvBidMicrosBuilder_ != null) {
        return cpvBidMicrosBuilder_.getMessageOrBuilder();
      } else {
        return cpvBidMicros_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : cpvBidMicros_;
      }
    }
    /**
     * <pre>
     * The simulated CPV bid upon which projected metrics are based.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cpv_bid_micros = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getCpvBidMicrosFieldBuilder() {
      if (cpvBidMicrosBuilder_ == null) {
        cpvBidMicrosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getCpvBidMicros(),
                getParentForChildren(),
                isClean());
        cpvBidMicros_ = null;
      }
      return cpvBidMicrosBuilder_;
    }

    private com.google.protobuf.Int64Value costMicros_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> costMicrosBuilder_;
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cost_micros = 2;</code>
     * @return Whether the costMicros field is set.
     */
    public boolean hasCostMicros() {
      return costMicrosBuilder_ != null || costMicros_ != null;
    }
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cost_micros = 2;</code>
     * @return The costMicros.
     */
    public com.google.protobuf.Int64Value getCostMicros() {
      if (costMicrosBuilder_ == null) {
        return costMicros_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : costMicros_;
      } else {
        return costMicrosBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cost_micros = 2;</code>
     */
    public Builder setCostMicros(com.google.protobuf.Int64Value value) {
      if (costMicrosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        costMicros_ = value;
        onChanged();
      } else {
        costMicrosBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cost_micros = 2;</code>
     */
    public Builder setCostMicros(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (costMicrosBuilder_ == null) {
        costMicros_ = builderForValue.build();
        onChanged();
      } else {
        costMicrosBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cost_micros = 2;</code>
     */
    public Builder mergeCostMicros(com.google.protobuf.Int64Value value) {
      if (costMicrosBuilder_ == null) {
        if (costMicros_ != null) {
          costMicros_ =
            com.google.protobuf.Int64Value.newBuilder(costMicros_).mergeFrom(value).buildPartial();
        } else {
          costMicros_ = value;
        }
        onChanged();
      } else {
        costMicrosBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cost_micros = 2;</code>
     */
    public Builder clearCostMicros() {
      if (costMicrosBuilder_ == null) {
        costMicros_ = null;
        onChanged();
      } else {
        costMicros_ = null;
        costMicrosBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cost_micros = 2;</code>
     */
    public com.google.protobuf.Int64Value.Builder getCostMicrosBuilder() {
      
      onChanged();
      return getCostMicrosFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cost_micros = 2;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getCostMicrosOrBuilder() {
      if (costMicrosBuilder_ != null) {
        return costMicrosBuilder_.getMessageOrBuilder();
      } else {
        return costMicros_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : costMicros_;
      }
    }
    /**
     * <pre>
     * Projected cost in micros.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value cost_micros = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getCostMicrosFieldBuilder() {
      if (costMicrosBuilder_ == null) {
        costMicrosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getCostMicros(),
                getParentForChildren(),
                isClean());
        costMicros_ = null;
      }
      return costMicrosBuilder_;
    }

    private com.google.protobuf.Int64Value impressions_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> impressionsBuilder_;
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value impressions = 3;</code>
     * @return Whether the impressions field is set.
     */
    public boolean hasImpressions() {
      return impressionsBuilder_ != null || impressions_ != null;
    }
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value impressions = 3;</code>
     * @return The impressions.
     */
    public com.google.protobuf.Int64Value getImpressions() {
      if (impressionsBuilder_ == null) {
        return impressions_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : impressions_;
      } else {
        return impressionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value impressions = 3;</code>
     */
    public Builder setImpressions(com.google.protobuf.Int64Value value) {
      if (impressionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        impressions_ = value;
        onChanged();
      } else {
        impressionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value impressions = 3;</code>
     */
    public Builder setImpressions(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (impressionsBuilder_ == null) {
        impressions_ = builderForValue.build();
        onChanged();
      } else {
        impressionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value impressions = 3;</code>
     */
    public Builder mergeImpressions(com.google.protobuf.Int64Value value) {
      if (impressionsBuilder_ == null) {
        if (impressions_ != null) {
          impressions_ =
            com.google.protobuf.Int64Value.newBuilder(impressions_).mergeFrom(value).buildPartial();
        } else {
          impressions_ = value;
        }
        onChanged();
      } else {
        impressionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value impressions = 3;</code>
     */
    public Builder clearImpressions() {
      if (impressionsBuilder_ == null) {
        impressions_ = null;
        onChanged();
      } else {
        impressions_ = null;
        impressionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value impressions = 3;</code>
     */
    public com.google.protobuf.Int64Value.Builder getImpressionsBuilder() {
      
      onChanged();
      return getImpressionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value impressions = 3;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getImpressionsOrBuilder() {
      if (impressionsBuilder_ != null) {
        return impressionsBuilder_.getMessageOrBuilder();
      } else {
        return impressions_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : impressions_;
      }
    }
    /**
     * <pre>
     * Projected number of impressions.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value impressions = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getImpressionsFieldBuilder() {
      if (impressionsBuilder_ == null) {
        impressionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getImpressions(),
                getParentForChildren(),
                isClean());
        impressions_ = null;
      }
      return impressionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.common.CpvBidSimulationPoint)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.common.CpvBidSimulationPoint)
  private static final com.google.ads.googleads.v1.common.CpvBidSimulationPoint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.common.CpvBidSimulationPoint();
  }

  public static com.google.ads.googleads.v1.common.CpvBidSimulationPoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CpvBidSimulationPoint>
      PARSER = new com.google.protobuf.AbstractParser<CpvBidSimulationPoint>() {
    @java.lang.Override
    public CpvBidSimulationPoint parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CpvBidSimulationPoint(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CpvBidSimulationPoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CpvBidSimulationPoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.common.CpvBidSimulationPoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

