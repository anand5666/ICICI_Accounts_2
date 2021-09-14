package ICICI_account.business.impl;

import org.springframework.stereotype.Service;

import ICICI_account.business.RoleService;
import ICICI_account.business.model.Role;

@Service
public class JPARoleService extends JPACRUDService<Long, Role> implements RoleService {

}
