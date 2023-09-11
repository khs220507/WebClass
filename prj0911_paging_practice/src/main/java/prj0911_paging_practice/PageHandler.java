package prj0911_paging_practice;

public class PageHandler {
	// given things
	int currentPage;
	int totalRecords;
	int pageSize;
	int grpSize;
	
	// things to calculate
	int totalPage;
	int currentGrp;
	int grpStartPage;
	int grpEndPage;
	
	
	
	
	public PageHandler(int currentPage, int totalRecords, int pageSize, int grpSize) {
		super();
		this.currentPage = currentPage;
		this.totalRecords = totalRecords;
		this.pageSize = pageSize;
		this.grpSize = grpSize;
		calcPage();
	}


	void calcPage() {
		int remain = totalRecords % pageSize;
		if(remain==0) {
			totalPage = totalRecords / pageSize;
		} else {
			totalPage = totalRecords / pageSize + 1;
		}
		
		int remain2 = currentPage % grpSize;
		if(remain2==0) {
			currentGrp = currentPage / grpSize;
		} else {
			currentGrp = currentPage / grpSize + 1;
		}
		
		grpStartPage = (currentGrp -1) * grpSize + 1;
		grpEndPage = currentGrp * grpSize;
		if(grpEndPage>totalPage) {
			grpEndPage = totalPage;
		}
	}
	
	
	public int getCurrentPage() {
		return currentPage;
	}
	public int getTotalRecords() {
		return totalRecords;
	}
	public int getPageSize() {
		return pageSize;
	}
	public int getGrpSize() {
		return grpSize;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public int getCurrentGrp() {
		return currentGrp;
	}
	public int getGrpStartPage() {
		return grpStartPage;
	}
	public int getGrpEndPage() {
		return grpEndPage;
	}
	
	
	

}
