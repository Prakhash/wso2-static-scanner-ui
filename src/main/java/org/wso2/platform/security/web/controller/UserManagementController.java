/*
 *
 *  *  Copyright (c) ${YEAR} WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *  *
 *  *  WSO2 Inc. licenses this file to you under the Apache License,
 *  *  Version 2.0 (the "License"); you may not use this file except
 *  *  in compliance with the License.
 *  *  You may obtain a copy of the License at
 *  *
 *  *  http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *  Unless required by applicable law or agreed to in writing,
 *  *  software distributed under the License is distributed on an
 *  *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  *  KIND, either express or implied.  See the License for the
 *  *  specific language governing permissions and limitations
 *  *  under the License.
 *  *
 *
 */

package org.wso2.platform.security.web.controller;

import org.apache.maven.shared.invoker.MavenInvocationException;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Observable;
import java.util.Observer;


@Controller
@EnableAutoConfiguration
@RequestMapping("web/")
public class UserManagementController {


    @RequestMapping(value = "uploadpage", method = RequestMethod.GET)
    public String runDependencyCheck(Model model) {
        System.out.println("sssssssssssssssssss");
        return "welcome";
    }


    @RequestMapping(value = "cloneProduct", method = RequestMethod.GET)
    @ResponseBody
    public boolean cloneProduct(@RequestParam("gitUrl") String url, @RequestParam("branch") String branch, @RequestParam("replaceExisting") boolean replaceExisting) throws GitAPIException, IOException {
        return true;

    }

}

