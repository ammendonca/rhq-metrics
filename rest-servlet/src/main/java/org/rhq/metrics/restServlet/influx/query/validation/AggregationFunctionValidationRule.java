/*
 * Copyright 2014-2015 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rhq.metrics.restServlet.influx.query.validation;

import java.util.List;

import org.rhq.metrics.restServlet.influx.query.parse.definition.FunctionArgument;

/**
 * @author Thomas Segismont
 */
public interface AggregationFunctionValidationRule {
    /**
     * @param aggregationFunctionArguments
     * @throws org.rhq.metrics.restServlet.influx.query.validation.IllegalQueryException
     */
    void checkArguments(List<FunctionArgument> aggregationFunctionArguments) throws IllegalQueryException;
}
