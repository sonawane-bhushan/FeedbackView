package com.cg.service;

import java.util.List;

import com.cg.dto.FeedbackParameters;
import com.cg.dto.FeedbackReport;
import com.cg.exception.FeedbackNotFoundException;

public interface FeedbackReportService {
	
	List<FeedbackReport> getByMonth(int month) throws FeedbackNotFoundException;
	
	List<FeedbackReport> getByFacultyForMonth(int facultyCode, int month) throws FeedbackNotFoundException;
	
	List<FeedbackReport> getDefaultersByMonth(int month) throws FeedbackNotFoundException;
	
	FeedbackParameters getAvgByMonth(int month);
	
	FeedbackParameters getAvgByMonthAndFaculty(int month, int faculty);
	
}
