package com.oracle.bmc.hdfs.contract.payloadcaching;

import com.oracle.bmc.hdfs.contract.BmcContract;
import com.oracle.bmc.hdfs.contract.TestBmcContractAppend;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.contract.AbstractFSContract;

public class TestPayloadCachingBmcContractAppend extends TestBmcContractAppend {
    @Override
    protected AbstractFSContract createContract(final Configuration conf) {
        return new BmcContract.PayloadCaching(conf);
    }

}
