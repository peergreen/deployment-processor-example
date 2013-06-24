/**
 * Copyright 2013 Peergreen S.A.S.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.peergreen.example.deployment.processor;

import com.peergreen.deployment.Artifact;
import com.peergreen.deployment.ProcessorContext;
import com.peergreen.deployment.ProcessorException;
import com.peergreen.deployment.processor.Phase;
import com.peergreen.deployment.processor.Processor;

/**
 * This processor will print the URI of every artifact which goes in START phase. (For example each bundle drop in deploy/ folder after that this processor is deployed will be displayed)
 * @author Florent Benoit
 */
@Processor
@Phase("START")
public class MyPrintProcessor {

    public void handle(Artifact artifact, ProcessorContext processorContext) throws ProcessorException {
        System.out.println("MyPrintProcessor : Artifact found is : " + artifact.uri());
    }
}
