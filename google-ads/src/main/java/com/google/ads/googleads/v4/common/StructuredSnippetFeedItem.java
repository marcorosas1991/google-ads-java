// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/common/extensions.proto

package com.google.ads.googleads.v4.common;

/**
 * <pre>
 * Represents a structured snippet extension.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v4.common.StructuredSnippetFeedItem}
 */
public final class StructuredSnippetFeedItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v4.common.StructuredSnippetFeedItem)
    StructuredSnippetFeedItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StructuredSnippetFeedItem.newBuilder() to construct.
  private StructuredSnippetFeedItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StructuredSnippetFeedItem() {
    values_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StructuredSnippetFeedItem();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StructuredSnippetFeedItem(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              values_ = new java.util.ArrayList<com.google.protobuf.StringValue>();
              mutable_bitField0_ |= 0x00000001;
            }
            values_.add(
                input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        values_ = java.util.Collections.unmodifiableList(values_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v4.common.ExtensionsProto.internal_static_google_ads_googleads_v4_common_StructuredSnippetFeedItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v4.common.ExtensionsProto.internal_static_google_ads_googleads_v4_common_StructuredSnippetFeedItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v4.common.StructuredSnippetFeedItem.class, com.google.ads.googleads.v4.common.StructuredSnippetFeedItem.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue header_;
  /**
   * <pre>
   * The header of the snippet.
   * This string must not be empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue header = 1;</code>
   * @return Whether the header field is set.
   */
  @java.lang.Override
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <pre>
   * The header of the snippet.
   * This string must not be empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue header = 1;</code>
   * @return The header.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getHeader() {
    return header_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : header_;
  }
  /**
   * <pre>
   * The header of the snippet.
   * This string must not be empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue header = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int VALUES_FIELD_NUMBER = 2;
  private java.util.List<com.google.protobuf.StringValue> values_;
  /**
   * <pre>
   * The values in the snippet.
   * The maximum size of this collection is 10.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue values = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.StringValue> getValuesList() {
    return values_;
  }
  /**
   * <pre>
   * The values in the snippet.
   * The maximum size of this collection is 10.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue values = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getValuesOrBuilderList() {
    return values_;
  }
  /**
   * <pre>
   * The values in the snippet.
   * The maximum size of this collection is 10.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue values = 2;</code>
   */
  @java.lang.Override
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <pre>
   * The values in the snippet.
   * The maximum size of this collection is 10.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue values = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getValues(int index) {
    return values_.get(index);
  }
  /**
   * <pre>
   * The values in the snippet.
   * The maximum size of this collection is 10.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue values = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getValuesOrBuilder(
      int index) {
    return values_.get(index);
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
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    for (int i = 0; i < values_.size(); i++) {
      output.writeMessage(2, values_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    for (int i = 0; i < values_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, values_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v4.common.StructuredSnippetFeedItem)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v4.common.StructuredSnippetFeedItem other = (com.google.ads.googleads.v4.common.StructuredSnippetFeedItem) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (!getValuesList()
        .equals(other.getValuesList())) return false;
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v4.common.StructuredSnippetFeedItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.StructuredSnippetFeedItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.StructuredSnippetFeedItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.StructuredSnippetFeedItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.StructuredSnippetFeedItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.common.StructuredSnippetFeedItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.StructuredSnippetFeedItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.StructuredSnippetFeedItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.StructuredSnippetFeedItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.StructuredSnippetFeedItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.common.StructuredSnippetFeedItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.common.StructuredSnippetFeedItem parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v4.common.StructuredSnippetFeedItem prototype) {
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
   * Represents a structured snippet extension.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v4.common.StructuredSnippetFeedItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v4.common.StructuredSnippetFeedItem)
      com.google.ads.googleads.v4.common.StructuredSnippetFeedItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v4.common.ExtensionsProto.internal_static_google_ads_googleads_v4_common_StructuredSnippetFeedItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v4.common.ExtensionsProto.internal_static_google_ads_googleads_v4_common_StructuredSnippetFeedItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v4.common.StructuredSnippetFeedItem.class, com.google.ads.googleads.v4.common.StructuredSnippetFeedItem.Builder.class);
    }

    // Construct using com.google.ads.googleads.v4.common.StructuredSnippetFeedItem.newBuilder()
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
        getValuesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        valuesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v4.common.ExtensionsProto.internal_static_google_ads_googleads_v4_common_StructuredSnippetFeedItem_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.StructuredSnippetFeedItem getDefaultInstanceForType() {
      return com.google.ads.googleads.v4.common.StructuredSnippetFeedItem.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.StructuredSnippetFeedItem build() {
      com.google.ads.googleads.v4.common.StructuredSnippetFeedItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.common.StructuredSnippetFeedItem buildPartial() {
      com.google.ads.googleads.v4.common.StructuredSnippetFeedItem result = new com.google.ads.googleads.v4.common.StructuredSnippetFeedItem(this);
      int from_bitField0_ = bitField0_;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (valuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          values_ = java.util.Collections.unmodifiableList(values_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.values_ = values_;
      } else {
        result.values_ = valuesBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v4.common.StructuredSnippetFeedItem) {
        return mergeFrom((com.google.ads.googleads.v4.common.StructuredSnippetFeedItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v4.common.StructuredSnippetFeedItem other) {
      if (other == com.google.ads.googleads.v4.common.StructuredSnippetFeedItem.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (valuesBuilder_ == null) {
        if (!other.values_.isEmpty()) {
          if (values_.isEmpty()) {
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureValuesIsMutable();
            values_.addAll(other.values_);
          }
          onChanged();
        }
      } else {
        if (!other.values_.isEmpty()) {
          if (valuesBuilder_.isEmpty()) {
            valuesBuilder_.dispose();
            valuesBuilder_ = null;
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
            valuesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getValuesFieldBuilder() : null;
          } else {
            valuesBuilder_.addAllMessages(other.values_);
          }
        }
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
      com.google.ads.googleads.v4.common.StructuredSnippetFeedItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v4.common.StructuredSnippetFeedItem) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.StringValue header_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> headerBuilder_;
    /**
     * <pre>
     * The header of the snippet.
     * This string must not be empty.
     * </pre>
     *
     * <code>.google.protobuf.StringValue header = 1;</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <pre>
     * The header of the snippet.
     * This string must not be empty.
     * </pre>
     *
     * <code>.google.protobuf.StringValue header = 1;</code>
     * @return The header.
     */
    public com.google.protobuf.StringValue getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The header of the snippet.
     * This string must not be empty.
     * </pre>
     *
     * <code>.google.protobuf.StringValue header = 1;</code>
     */
    public Builder setHeader(com.google.protobuf.StringValue value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The header of the snippet.
     * This string must not be empty.
     * </pre>
     *
     * <code>.google.protobuf.StringValue header = 1;</code>
     */
    public Builder setHeader(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The header of the snippet.
     * This string must not be empty.
     * </pre>
     *
     * <code>.google.protobuf.StringValue header = 1;</code>
     */
    public Builder mergeHeader(com.google.protobuf.StringValue value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            com.google.protobuf.StringValue.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The header of the snippet.
     * This string must not be empty.
     * </pre>
     *
     * <code>.google.protobuf.StringValue header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The header of the snippet.
     * This string must not be empty.
     * </pre>
     *
     * <code>.google.protobuf.StringValue header = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The header of the snippet.
     * This string must not be empty.
     * </pre>
     *
     * <code>.google.protobuf.StringValue header = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : header_;
      }
    }
    /**
     * <pre>
     * The header of the snippet.
     * This string must not be empty.
     * </pre>
     *
     * <code>.google.protobuf.StringValue header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private java.util.List<com.google.protobuf.StringValue> values_ =
      java.util.Collections.emptyList();
    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        values_ = new java.util.ArrayList<com.google.protobuf.StringValue>(values_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> valuesBuilder_;

    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue values = 2;</code>
     */
    public java.util.List<com.google.protobuf.StringValue> getValuesList() {
      if (valuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(values_);
      } else {
        return valuesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue values = 2;</code>
     */
    public int getValuesCount() {
      if (valuesBuilder_ == null) {
        return values_.size();
      } else {
        return valuesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue values = 2;</code>
     */
    public com.google.protobuf.StringValue getValues(int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);
      } else {
        return valuesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue values = 2;</code>
     */
    public Builder setValues(
        int index, com.google.protobuf.StringValue value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.set(index, value);
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue values = 2;</code>
     */
    public Builder setValues(
        int index, com.google.protobuf.StringValue.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.set(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue values = 2;</code>
     */
    public Builder addValues(com.google.protobuf.StringValue value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue values = 2;</code>
     */
    public Builder addValues(
        int index, com.google.protobuf.StringValue value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(index, value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue values = 2;</code>
     */
    public Builder addValues(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue values = 2;</code>
     */
    public Builder addValues(
        int index, com.google.protobuf.StringValue.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue values = 2;</code>
     */
    public Builder addAllValues(
        java.lang.Iterable<? extends com.google.protobuf.StringValue> values) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, values_);
        onChanged();
      } else {
        valuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue values = 2;</code>
     */
    public Builder clearValues() {
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        valuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue values = 2;</code>
     */
    public Builder removeValues(int index) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.remove(index);
        onChanged();
      } else {
        valuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue values = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getValuesBuilder(
        int index) {
      return getValuesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue values = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getValuesOrBuilder(
        int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);  } else {
        return valuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue values = 2;</code>
     */
    public java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
         getValuesOrBuilderList() {
      if (valuesBuilder_ != null) {
        return valuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(values_);
      }
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue values = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder addValuesBuilder() {
      return getValuesFieldBuilder().addBuilder(
          com.google.protobuf.StringValue.getDefaultInstance());
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue values = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder addValuesBuilder(
        int index) {
      return getValuesFieldBuilder().addBuilder(
          index, com.google.protobuf.StringValue.getDefaultInstance());
    }
    /**
     * <pre>
     * The values in the snippet.
     * The maximum size of this collection is 10.
     * </pre>
     *
     * <code>repeated .google.protobuf.StringValue values = 2;</code>
     */
    public java.util.List<com.google.protobuf.StringValue.Builder> 
         getValuesBuilderList() {
      return getValuesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getValuesFieldBuilder() {
      if (valuesBuilder_ == null) {
        valuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                values_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        values_ = null;
      }
      return valuesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v4.common.StructuredSnippetFeedItem)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v4.common.StructuredSnippetFeedItem)
  private static final com.google.ads.googleads.v4.common.StructuredSnippetFeedItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v4.common.StructuredSnippetFeedItem();
  }

  public static com.google.ads.googleads.v4.common.StructuredSnippetFeedItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StructuredSnippetFeedItem>
      PARSER = new com.google.protobuf.AbstractParser<StructuredSnippetFeedItem>() {
    @java.lang.Override
    public StructuredSnippetFeedItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StructuredSnippetFeedItem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StructuredSnippetFeedItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StructuredSnippetFeedItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v4.common.StructuredSnippetFeedItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

