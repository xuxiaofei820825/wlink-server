// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wlink/ErrorMessageProto.proto

package com.iauto.wlink.core.message.proto;

public final class ErrorMessageProto {
  private ErrorMessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ErrorMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.iauto.wlink.core.message.proto.ErrorMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string error = 1 [default = ""];</code>
     */
    boolean hasError();
    /**
     * <code>required string error = 1 [default = ""];</code>
     */
    java.lang.String getError();
    /**
     * <code>required string error = 1 [default = ""];</code>
     */
    com.google.protobuf.ByteString
        getErrorBytes();
  }
  /**
   * Protobuf type {@code com.iauto.wlink.core.message.proto.ErrorMessage}
   */
  public static final class ErrorMessage extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.iauto.wlink.core.message.proto.ErrorMessage)
      ErrorMessageOrBuilder {
    // Use ErrorMessage.newBuilder() to construct.
    private ErrorMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ErrorMessage(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ErrorMessage defaultInstance;
    public static ErrorMessage getDefaultInstance() {
      return defaultInstance;
    }

    public ErrorMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ErrorMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              error_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.iauto.wlink.core.message.proto.ErrorMessageProto.internal_static_com_iauto_wlink_core_message_proto_ErrorMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.iauto.wlink.core.message.proto.ErrorMessageProto.internal_static_com_iauto_wlink_core_message_proto_ErrorMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage.class, com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<ErrorMessage> PARSER =
        new com.google.protobuf.AbstractParser<ErrorMessage>() {
      public ErrorMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ErrorMessage(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ErrorMessage> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ERROR_FIELD_NUMBER = 1;
    private java.lang.Object error_;
    /**
     * <code>required string error = 1 [default = ""];</code>
     */
    public boolean hasError() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string error = 1 [default = ""];</code>
     */
    public java.lang.String getError() {
      java.lang.Object ref = error_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          error_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string error = 1 [default = ""];</code>
     */
    public com.google.protobuf.ByteString
        getErrorBytes() {
      java.lang.Object ref = error_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      error_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasError()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getErrorBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getErrorBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.iauto.wlink.core.message.proto.ErrorMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.iauto.wlink.core.message.proto.ErrorMessage)
        com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.iauto.wlink.core.message.proto.ErrorMessageProto.internal_static_com_iauto_wlink_core_message_proto_ErrorMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.iauto.wlink.core.message.proto.ErrorMessageProto.internal_static_com_iauto_wlink_core_message_proto_ErrorMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage.class, com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage.Builder.class);
      }

      // Construct using com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        error_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.iauto.wlink.core.message.proto.ErrorMessageProto.internal_static_com_iauto_wlink_core_message_proto_ErrorMessage_descriptor;
      }

      public com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage getDefaultInstanceForType() {
        return com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage.getDefaultInstance();
      }

      public com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage build() {
        com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage buildPartial() {
        com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage result = new com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.error_ = error_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage) {
          return mergeFrom((com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage other) {
        if (other == com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage.getDefaultInstance()) return this;
        if (other.hasError()) {
          bitField0_ |= 0x00000001;
          error_ = other.error_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasError()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.iauto.wlink.core.message.proto.ErrorMessageProto.ErrorMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object error_ = "";
      /**
       * <code>required string error = 1 [default = ""];</code>
       */
      public boolean hasError() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string error = 1 [default = ""];</code>
       */
      public java.lang.String getError() {
        java.lang.Object ref = error_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            error_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string error = 1 [default = ""];</code>
       */
      public com.google.protobuf.ByteString
          getErrorBytes() {
        java.lang.Object ref = error_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          error_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string error = 1 [default = ""];</code>
       */
      public Builder setError(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        error_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string error = 1 [default = ""];</code>
       */
      public Builder clearError() {
        bitField0_ = (bitField0_ & ~0x00000001);
        error_ = getDefaultInstance().getError();
        onChanged();
        return this;
      }
      /**
       * <code>required string error = 1 [default = ""];</code>
       */
      public Builder setErrorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        error_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.iauto.wlink.core.message.proto.ErrorMessage)
    }

    static {
      defaultInstance = new ErrorMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.iauto.wlink.core.message.proto.ErrorMessage)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_iauto_wlink_core_message_proto_ErrorMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_iauto_wlink_core_message_proto_ErrorMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035wlink/ErrorMessageProto.proto\022\"com.iau" +
      "to.wlink.core.message.proto\"\037\n\014ErrorMess" +
      "age\022\017\n\005error\030\001 \002(\t:\000"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_iauto_wlink_core_message_proto_ErrorMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_iauto_wlink_core_message_proto_ErrorMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_iauto_wlink_core_message_proto_ErrorMessage_descriptor,
        new java.lang.String[] { "Error", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
