package com.yan.entity;

import java.util.ArrayList;
import java.util.List;
public class Pagination<T> {

	private Integer pageIndex;
	private Integer pageSize;
	private List<T> rows = new ArrayList<T>();
	private Integer startRow;
	private Integer endRow;
	private Long total;
	private T filter;
	
	
	public T getFilter() {
		return filter;
	}
	public void setFilter(T filter) {
		this.filter = filter;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public Pagination() {
	}
	public Pagination(Integer pageIndex, Integer pageSize) {
		super();
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
	}
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	 public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public Integer getPageSize() {
		return pageSize==null?10:pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	/*  
     * start line  
     */    
    public Integer getStartRow() {    
    	if (pageIndex!=null&&pageIndex!=0) {
    		 return (pageIndex - 1) * pageSize;    
		}else {
			return 0;
		}
       

    }    
    /*  
     * end line  
     */    
    public Integer getEndRow() {    
    	if (pageIndex!=null&&pageIndex!=0) {
    		 return pageIndex * pageSize;    
		}else {
			return 0;
		}
    } 
    public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	public void setEndRow(Integer endRow) {
		this.endRow = endRow;
	}
}
