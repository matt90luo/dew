package com.ecfront.dew.auth.controller;

import com.ecfront.dew.auth.entity.Tenant;
import com.ecfront.dew.auth.service.TenantService;
import com.ecfront.dew.core.controller.SimpleController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth/manage/tenant/")
public class TenantController extends SimpleController<TenantService, Tenant> {


}