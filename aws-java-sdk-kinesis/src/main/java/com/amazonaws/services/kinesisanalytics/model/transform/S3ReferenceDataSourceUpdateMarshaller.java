/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kinesisanalytics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalytics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * S3ReferenceDataSourceUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class S3ReferenceDataSourceUpdateMarshaller {

    private static final MarshallingInfo<String> BUCKETARNUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BucketARNUpdate").build();
    private static final MarshallingInfo<String> FILEKEYUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileKeyUpdate").build();
    private static final MarshallingInfo<String> REFERENCEROLEARNUPDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReferenceRoleARNUpdate").build();

    private static final S3ReferenceDataSourceUpdateMarshaller instance = new S3ReferenceDataSourceUpdateMarshaller();

    public static S3ReferenceDataSourceUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(S3ReferenceDataSourceUpdate s3ReferenceDataSourceUpdate, ProtocolMarshaller protocolMarshaller) {

        if (s3ReferenceDataSourceUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(s3ReferenceDataSourceUpdate.getBucketARNUpdate(), BUCKETARNUPDATE_BINDING);
            protocolMarshaller.marshall(s3ReferenceDataSourceUpdate.getFileKeyUpdate(), FILEKEYUPDATE_BINDING);
            protocolMarshaller.marshall(s3ReferenceDataSourceUpdate.getReferenceRoleARNUpdate(), REFERENCEROLEARNUPDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
