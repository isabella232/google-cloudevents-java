// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/firebase/database/v1/data.proto

package google.events.firebase.database.v1;

public final class Data {
  private Data() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReferenceEventDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.events.firebase.database.v1.ReferenceEventData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The original data for the reference.
     * </pre>
     *
     * <code>.google.protobuf.Value data = 1;</code>
     * @return Whether the data field is set.
     */
    boolean hasData();
    /**
     * <pre>
     * The original data for the reference.
     * </pre>
     *
     * <code>.google.protobuf.Value data = 1;</code>
     * @return The data.
     */
    com.google.protobuf.Value getData();
    /**
     * <pre>
     * The original data for the reference.
     * </pre>
     *
     * <code>.google.protobuf.Value data = 1;</code>
     */
    com.google.protobuf.ValueOrBuilder getDataOrBuilder();

    /**
     * <pre>
     * The change in the reference data.
     * </pre>
     *
     * <code>.google.protobuf.Value delta = 2;</code>
     * @return Whether the delta field is set.
     */
    boolean hasDelta();
    /**
     * <pre>
     * The change in the reference data.
     * </pre>
     *
     * <code>.google.protobuf.Value delta = 2;</code>
     * @return The delta.
     */
    com.google.protobuf.Value getDelta();
    /**
     * <pre>
     * The change in the reference data.
     * </pre>
     *
     * <code>.google.protobuf.Value delta = 2;</code>
     */
    com.google.protobuf.ValueOrBuilder getDeltaOrBuilder();
  }
  /**
   * <pre>
   * The data within all Firebase Real Time Database reference events.
   * </pre>
   *
   * Protobuf type {@code google.events.firebase.database.v1.ReferenceEventData}
   */
  public static final class ReferenceEventData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:google.events.firebase.database.v1.ReferenceEventData)
      ReferenceEventDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReferenceEventData.newBuilder() to construct.
    private ReferenceEventData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReferenceEventData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReferenceEventData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReferenceEventData(
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
              com.google.protobuf.Value.Builder subBuilder = null;
              if (data_ != null) {
                subBuilder = data_.toBuilder();
              }
              data_ = input.readMessage(com.google.protobuf.Value.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(data_);
                data_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              com.google.protobuf.Value.Builder subBuilder = null;
              if (delta_ != null) {
                subBuilder = delta_.toBuilder();
              }
              delta_ = input.readMessage(com.google.protobuf.Value.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(delta_);
                delta_ = subBuilder.buildPartial();
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
      return google.events.firebase.database.v1.Data.internal_static_google_events_firebase_database_v1_ReferenceEventData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.events.firebase.database.v1.Data.internal_static_google_events_firebase_database_v1_ReferenceEventData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.events.firebase.database.v1.Data.ReferenceEventData.class, google.events.firebase.database.v1.Data.ReferenceEventData.Builder.class);
    }

    public static final int DATA_FIELD_NUMBER = 1;
    private com.google.protobuf.Value data_;
    /**
     * <pre>
     * The original data for the reference.
     * </pre>
     *
     * <code>.google.protobuf.Value data = 1;</code>
     * @return Whether the data field is set.
     */
    @java.lang.Override
    public boolean hasData() {
      return data_ != null;
    }
    /**
     * <pre>
     * The original data for the reference.
     * </pre>
     *
     * <code>.google.protobuf.Value data = 1;</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.Value getData() {
      return data_ == null ? com.google.protobuf.Value.getDefaultInstance() : data_;
    }
    /**
     * <pre>
     * The original data for the reference.
     * </pre>
     *
     * <code>.google.protobuf.Value data = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ValueOrBuilder getDataOrBuilder() {
      return getData();
    }

    public static final int DELTA_FIELD_NUMBER = 2;
    private com.google.protobuf.Value delta_;
    /**
     * <pre>
     * The change in the reference data.
     * </pre>
     *
     * <code>.google.protobuf.Value delta = 2;</code>
     * @return Whether the delta field is set.
     */
    @java.lang.Override
    public boolean hasDelta() {
      return delta_ != null;
    }
    /**
     * <pre>
     * The change in the reference data.
     * </pre>
     *
     * <code>.google.protobuf.Value delta = 2;</code>
     * @return The delta.
     */
    @java.lang.Override
    public com.google.protobuf.Value getDelta() {
      return delta_ == null ? com.google.protobuf.Value.getDefaultInstance() : delta_;
    }
    /**
     * <pre>
     * The change in the reference data.
     * </pre>
     *
     * <code>.google.protobuf.Value delta = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ValueOrBuilder getDeltaOrBuilder() {
      return getDelta();
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
      if (data_ != null) {
        output.writeMessage(1, getData());
      }
      if (delta_ != null) {
        output.writeMessage(2, getDelta());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (data_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getData());
      }
      if (delta_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getDelta());
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
      if (!(obj instanceof google.events.firebase.database.v1.Data.ReferenceEventData)) {
        return super.equals(obj);
      }
      google.events.firebase.database.v1.Data.ReferenceEventData other = (google.events.firebase.database.v1.Data.ReferenceEventData) obj;

      if (hasData() != other.hasData()) return false;
      if (hasData()) {
        if (!getData()
            .equals(other.getData())) return false;
      }
      if (hasDelta() != other.hasDelta()) return false;
      if (hasDelta()) {
        if (!getDelta()
            .equals(other.getDelta())) return false;
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
      if (hasData()) {
        hash = (37 * hash) + DATA_FIELD_NUMBER;
        hash = (53 * hash) + getData().hashCode();
      }
      if (hasDelta()) {
        hash = (37 * hash) + DELTA_FIELD_NUMBER;
        hash = (53 * hash) + getDelta().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.events.firebase.database.v1.Data.ReferenceEventData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.events.firebase.database.v1.Data.ReferenceEventData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.events.firebase.database.v1.Data.ReferenceEventData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.events.firebase.database.v1.Data.ReferenceEventData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.events.firebase.database.v1.Data.ReferenceEventData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.events.firebase.database.v1.Data.ReferenceEventData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.events.firebase.database.v1.Data.ReferenceEventData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.events.firebase.database.v1.Data.ReferenceEventData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.events.firebase.database.v1.Data.ReferenceEventData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.events.firebase.database.v1.Data.ReferenceEventData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.events.firebase.database.v1.Data.ReferenceEventData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.events.firebase.database.v1.Data.ReferenceEventData parseFrom(
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
    public static Builder newBuilder(google.events.firebase.database.v1.Data.ReferenceEventData prototype) {
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
     * The data within all Firebase Real Time Database reference events.
     * </pre>
     *
     * Protobuf type {@code google.events.firebase.database.v1.ReferenceEventData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:google.events.firebase.database.v1.ReferenceEventData)
        google.events.firebase.database.v1.Data.ReferenceEventDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.events.firebase.database.v1.Data.internal_static_google_events_firebase_database_v1_ReferenceEventData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.events.firebase.database.v1.Data.internal_static_google_events_firebase_database_v1_ReferenceEventData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.events.firebase.database.v1.Data.ReferenceEventData.class, google.events.firebase.database.v1.Data.ReferenceEventData.Builder.class);
      }

      // Construct using google.events.firebase.database.v1.Data.ReferenceEventData.newBuilder()
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
        if (dataBuilder_ == null) {
          data_ = null;
        } else {
          data_ = null;
          dataBuilder_ = null;
        }
        if (deltaBuilder_ == null) {
          delta_ = null;
        } else {
          delta_ = null;
          deltaBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.events.firebase.database.v1.Data.internal_static_google_events_firebase_database_v1_ReferenceEventData_descriptor;
      }

      @java.lang.Override
      public google.events.firebase.database.v1.Data.ReferenceEventData getDefaultInstanceForType() {
        return google.events.firebase.database.v1.Data.ReferenceEventData.getDefaultInstance();
      }

      @java.lang.Override
      public google.events.firebase.database.v1.Data.ReferenceEventData build() {
        google.events.firebase.database.v1.Data.ReferenceEventData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public google.events.firebase.database.v1.Data.ReferenceEventData buildPartial() {
        google.events.firebase.database.v1.Data.ReferenceEventData result = new google.events.firebase.database.v1.Data.ReferenceEventData(this);
        if (dataBuilder_ == null) {
          result.data_ = data_;
        } else {
          result.data_ = dataBuilder_.build();
        }
        if (deltaBuilder_ == null) {
          result.delta_ = delta_;
        } else {
          result.delta_ = deltaBuilder_.build();
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
        if (other instanceof google.events.firebase.database.v1.Data.ReferenceEventData) {
          return mergeFrom((google.events.firebase.database.v1.Data.ReferenceEventData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.events.firebase.database.v1.Data.ReferenceEventData other) {
        if (other == google.events.firebase.database.v1.Data.ReferenceEventData.getDefaultInstance()) return this;
        if (other.hasData()) {
          mergeData(other.getData());
        }
        if (other.hasDelta()) {
          mergeDelta(other.getDelta());
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
        google.events.firebase.database.v1.Data.ReferenceEventData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.events.firebase.database.v1.Data.ReferenceEventData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.Value data_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Value, com.google.protobuf.Value.Builder, com.google.protobuf.ValueOrBuilder> dataBuilder_;
      /**
       * <pre>
       * The original data for the reference.
       * </pre>
       *
       * <code>.google.protobuf.Value data = 1;</code>
       * @return Whether the data field is set.
       */
      public boolean hasData() {
        return dataBuilder_ != null || data_ != null;
      }
      /**
       * <pre>
       * The original data for the reference.
       * </pre>
       *
       * <code>.google.protobuf.Value data = 1;</code>
       * @return The data.
       */
      public com.google.protobuf.Value getData() {
        if (dataBuilder_ == null) {
          return data_ == null ? com.google.protobuf.Value.getDefaultInstance() : data_;
        } else {
          return dataBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The original data for the reference.
       * </pre>
       *
       * <code>.google.protobuf.Value data = 1;</code>
       */
      public Builder setData(com.google.protobuf.Value value) {
        if (dataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          data_ = value;
          onChanged();
        } else {
          dataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * The original data for the reference.
       * </pre>
       *
       * <code>.google.protobuf.Value data = 1;</code>
       */
      public Builder setData(
          com.google.protobuf.Value.Builder builderForValue) {
        if (dataBuilder_ == null) {
          data_ = builderForValue.build();
          onChanged();
        } else {
          dataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * The original data for the reference.
       * </pre>
       *
       * <code>.google.protobuf.Value data = 1;</code>
       */
      public Builder mergeData(com.google.protobuf.Value value) {
        if (dataBuilder_ == null) {
          if (data_ != null) {
            data_ =
              com.google.protobuf.Value.newBuilder(data_).mergeFrom(value).buildPartial();
          } else {
            data_ = value;
          }
          onChanged();
        } else {
          dataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * The original data for the reference.
       * </pre>
       *
       * <code>.google.protobuf.Value data = 1;</code>
       */
      public Builder clearData() {
        if (dataBuilder_ == null) {
          data_ = null;
          onChanged();
        } else {
          data_ = null;
          dataBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * The original data for the reference.
       * </pre>
       *
       * <code>.google.protobuf.Value data = 1;</code>
       */
      public com.google.protobuf.Value.Builder getDataBuilder() {
        
        onChanged();
        return getDataFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The original data for the reference.
       * </pre>
       *
       * <code>.google.protobuf.Value data = 1;</code>
       */
      public com.google.protobuf.ValueOrBuilder getDataOrBuilder() {
        if (dataBuilder_ != null) {
          return dataBuilder_.getMessageOrBuilder();
        } else {
          return data_ == null ?
              com.google.protobuf.Value.getDefaultInstance() : data_;
        }
      }
      /**
       * <pre>
       * The original data for the reference.
       * </pre>
       *
       * <code>.google.protobuf.Value data = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Value, com.google.protobuf.Value.Builder, com.google.protobuf.ValueOrBuilder> 
          getDataFieldBuilder() {
        if (dataBuilder_ == null) {
          dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Value, com.google.protobuf.Value.Builder, com.google.protobuf.ValueOrBuilder>(
                  getData(),
                  getParentForChildren(),
                  isClean());
          data_ = null;
        }
        return dataBuilder_;
      }

      private com.google.protobuf.Value delta_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Value, com.google.protobuf.Value.Builder, com.google.protobuf.ValueOrBuilder> deltaBuilder_;
      /**
       * <pre>
       * The change in the reference data.
       * </pre>
       *
       * <code>.google.protobuf.Value delta = 2;</code>
       * @return Whether the delta field is set.
       */
      public boolean hasDelta() {
        return deltaBuilder_ != null || delta_ != null;
      }
      /**
       * <pre>
       * The change in the reference data.
       * </pre>
       *
       * <code>.google.protobuf.Value delta = 2;</code>
       * @return The delta.
       */
      public com.google.protobuf.Value getDelta() {
        if (deltaBuilder_ == null) {
          return delta_ == null ? com.google.protobuf.Value.getDefaultInstance() : delta_;
        } else {
          return deltaBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The change in the reference data.
       * </pre>
       *
       * <code>.google.protobuf.Value delta = 2;</code>
       */
      public Builder setDelta(com.google.protobuf.Value value) {
        if (deltaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          delta_ = value;
          onChanged();
        } else {
          deltaBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * The change in the reference data.
       * </pre>
       *
       * <code>.google.protobuf.Value delta = 2;</code>
       */
      public Builder setDelta(
          com.google.protobuf.Value.Builder builderForValue) {
        if (deltaBuilder_ == null) {
          delta_ = builderForValue.build();
          onChanged();
        } else {
          deltaBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * The change in the reference data.
       * </pre>
       *
       * <code>.google.protobuf.Value delta = 2;</code>
       */
      public Builder mergeDelta(com.google.protobuf.Value value) {
        if (deltaBuilder_ == null) {
          if (delta_ != null) {
            delta_ =
              com.google.protobuf.Value.newBuilder(delta_).mergeFrom(value).buildPartial();
          } else {
            delta_ = value;
          }
          onChanged();
        } else {
          deltaBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * The change in the reference data.
       * </pre>
       *
       * <code>.google.protobuf.Value delta = 2;</code>
       */
      public Builder clearDelta() {
        if (deltaBuilder_ == null) {
          delta_ = null;
          onChanged();
        } else {
          delta_ = null;
          deltaBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * The change in the reference data.
       * </pre>
       *
       * <code>.google.protobuf.Value delta = 2;</code>
       */
      public com.google.protobuf.Value.Builder getDeltaBuilder() {
        
        onChanged();
        return getDeltaFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The change in the reference data.
       * </pre>
       *
       * <code>.google.protobuf.Value delta = 2;</code>
       */
      public com.google.protobuf.ValueOrBuilder getDeltaOrBuilder() {
        if (deltaBuilder_ != null) {
          return deltaBuilder_.getMessageOrBuilder();
        } else {
          return delta_ == null ?
              com.google.protobuf.Value.getDefaultInstance() : delta_;
        }
      }
      /**
       * <pre>
       * The change in the reference data.
       * </pre>
       *
       * <code>.google.protobuf.Value delta = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Value, com.google.protobuf.Value.Builder, com.google.protobuf.ValueOrBuilder> 
          getDeltaFieldBuilder() {
        if (deltaBuilder_ == null) {
          deltaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Value, com.google.protobuf.Value.Builder, com.google.protobuf.ValueOrBuilder>(
                  getDelta(),
                  getParentForChildren(),
                  isClean());
          delta_ = null;
        }
        return deltaBuilder_;
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


      // @@protoc_insertion_point(builder_scope:google.events.firebase.database.v1.ReferenceEventData)
    }

    // @@protoc_insertion_point(class_scope:google.events.firebase.database.v1.ReferenceEventData)
    private static final google.events.firebase.database.v1.Data.ReferenceEventData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.events.firebase.database.v1.Data.ReferenceEventData();
    }

    public static google.events.firebase.database.v1.Data.ReferenceEventData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReferenceEventData>
        PARSER = new com.google.protobuf.AbstractParser<ReferenceEventData>() {
      @java.lang.Override
      public ReferenceEventData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReferenceEventData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReferenceEventData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReferenceEventData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public google.events.firebase.database.v1.Data.ReferenceEventData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_events_firebase_database_v1_ReferenceEventData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_events_firebase_database_v1_ReferenceEventData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/events/firebase/database/v1/dat" +
      "a.proto\022\"google.events.firebase.database" +
      ".v1\032\034google/protobuf/struct.proto\"a\n\022Ref" +
      "erenceEventData\022$\n\004data\030\001 \001(\0132\026.google.p" +
      "rotobuf.Value\022%\n\005delta\030\002 \001(\0132\026.google.pr" +
      "otobuf.ValueB.\252\002+Google.Events.Protobuf." +
      "Firebase.Database.V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_events_firebase_database_v1_ReferenceEventData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_events_firebase_database_v1_ReferenceEventData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_events_firebase_database_v1_ReferenceEventData_descriptor,
        new java.lang.String[] { "Data", "Delta", });
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
