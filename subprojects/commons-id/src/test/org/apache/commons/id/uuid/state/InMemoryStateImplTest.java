/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.id.uuid.state;

import org.junit.Ignore;

import junit.framework.TestCase;

/**
 * Unit tests for {@link InMemoryStateImpl}.
 *
 * @version $Revision: 480488 $ $Date: 2006-11-29 09:57:26 +0100 (st, 29 11 2006) $
 * @author Commons-Id team
 */
public class InMemoryStateImplTest extends TestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * <p>Test the InMemoryStateImpl constructor.</p>
     */
    public void testInMemoryStateImpl() {
        InMemoryStateImpl impl = new InMemoryStateImpl();
        assertNotNull(impl);
    }

    /**
     * <p>Test the void load method.</p>
     *
     * @throws Exception a test exception.
    */
    public void ignoreLoad() throws Exception {
        InMemoryStateImpl impl = new InMemoryStateImpl();
        impl.load();
        assertEquals(1, impl.getNodes().size());
    } 

    /**
     * <p>Test the void load method.</p>
     */
    public void testGetSynchInterval() {
        InMemoryStateImpl impl = new InMemoryStateImpl();
        assertEquals(impl.getSynchInterval(), Long.MAX_VALUE);
    }

    /**
     * <p>Test the Set getNodes method.</p>
     */
    public void ignoreGetNodes() {
        InMemoryStateImpl impl = new InMemoryStateImpl();
        impl.load();
        assertNotNull(impl.getNodes());
    }

    /**
     * <p>Test the void store method.</p>
     */
    public void ignoreStore() {
        // No operation, just make sure no exception is raised
        InMemoryStateImpl impl = new InMemoryStateImpl();
        impl.load();
        impl.store(impl.getNodes());
        impl.store(impl.getNodes(), 100L);
    }
}
