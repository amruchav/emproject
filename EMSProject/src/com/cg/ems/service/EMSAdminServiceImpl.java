package com.cg.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.dao.IEMSAdminDAO;
import com.cg.ems.dtos.DepartmentBean;
import com.cg.ems.dtos.DesignationBean;
import com.cg.ems.dtos.EmployeeBean;
import com.cg.ems.dtos.LoginDetailsBean;

@Service
public class EMSAdminServiceImpl implements IEMSAdminService{

	@Autowired
	private IEMSAdminDAO adminDao;
	
	
	public IEMSAdminDAO getAdminDao() {
		return adminDao;
	}


	public void setAdminDao(IEMSAdminDAO adminDao) {
		this.adminDao = adminDao;
	}


	@Override
	public List<DepartmentBean> getAllDepartment() {
		return adminDao.getAllDepartment();
	}


	@Override
	public List<DesignationBean> getAllDesig() {
		
		return adminDao.getAllDesig();
	}


	@Override
	public EmployeeBean insertNewEmployee(EmployeeBean empBean) {
		return adminDao.insertNewEmployee(empBean);
	}


	@Override
	public LoginDetailsBean insertLoginDetails(LoginDetailsBean logBean) {
		return adminDao.insertLoginDetails(logBean);
	}


	@Override
	public EmployeeBean searchById(int empId) {
		return adminDao.searchById(empId);
	}


	@Override
	public void update(EmployeeBean empBean) {
		adminDao.update(empBean);
	}


	@Override
	public void updateLoginDetails(LoginDetailsBean logBean) {
		adminDao.updateLoginDetails(logBean);
	}


	@Override
	public List<EmployeeBean> retrieveAllDetails() {
		return adminDao.retrieveAllDetails();
	}


	@Override
	public DepartmentBean getDeptName(int deptId) {
		return adminDao.getDeptName(deptId);
	}


	@Override
	public DesignationBean getDesigName(int desigId) {
		return adminDao.getDesigName(desigId);
	}
	

}
