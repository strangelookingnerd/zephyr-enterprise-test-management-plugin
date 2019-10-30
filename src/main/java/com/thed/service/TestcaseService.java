package com.thed.service;

import com.thed.model.TCRCatalogTreeTestcase;
import com.thed.model.Testcase;
import hudson.tasks.junit.CaseResult;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

/**
 * Created by tarun on 25/6/19.
 */
public interface TestcaseService extends BaseService {

    /**
     * Get testcases for given tree id.
     * @param tcrCatalogTreeId
     * @return
     * @throws URISyntaxException
     */
    List<TCRCatalogTreeTestcase> getTestcasesForTreeId(Long tcrCatalogTreeId) throws URISyntaxException;

    /**
     * Create testcases in bulk.
     * @param tcrCatalogTreeTestcases
     * @return
     * @throws URISyntaxException
     */
    List<TCRCatalogTreeTestcase> createTestcases(List<TCRCatalogTreeTestcase> tcrCatalogTreeTestcases) throws URISyntaxException;

    /**
     * Create testcases from CaseResults and return testcases with their execution status
     * @param treeIdCaseResultMap
     * @return
     * @throws URISyntaxException
     */
    Map<CaseResult, TCRCatalogTreeTestcase> createTestcases(Map<Long, List<CaseResult>> treeIdCaseResultMap) throws URISyntaxException;
}