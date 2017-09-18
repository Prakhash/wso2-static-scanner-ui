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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wso2.platform.security.web.entity.Component;
import org.wso2.platform.security.web.entity.User;
import org.wso2.platform.security.web.service.ComponentService;

@Controller
@RequestMapping("component/")
public class ComponentManagementController {

    @Autowired
    private ComponentService componentService;

    @RequestMapping(value="/add-component-details",method = RequestMethod.POST)
    @ResponseBody
    public String addComponentDetails(Model model, @RequestParam String username
            , @RequestParam String email, @RequestParam String team, @RequestParam String componentname) {


        User user=new User();
        user.setUserName(username);
        user.setUserEmail(email);
        user.setTeam(team);


        Component component=new Component();
        component.setUser(user);
        component.setComponantName(componentname);

        componentService.save(component);

        return "success";
    }
}
