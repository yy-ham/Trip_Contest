package com.example.demo.trip.service;

import com.example.demo.korea.vo.KoreaVO;
import com.example.demo.trip.dao.TripDAO;
import com.example.demo.trip.db.TripDBManager;
import com.example.demo.trip.entity.Trip;
import com.example.demo.trip.vo.ImgVO;
import com.example.demo.trip.vo.TripVO;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


@Service
@Setter
public class TripService {

    @Autowired
    private TripDAO tripDAO;

    public int getNextTripNo(){
        return tripDAO.getNextTripNo();
    }

    public Trip findByTripNo(int tripNo){
        return tripDAO.findByTripNo(tripNo);
    }

    public Trip save(Trip trip){
        return tripDAO.save(trip);
    }

    public void deleteByTripNo(int tripNo){
        tripDAO.deleteById(tripNo);
    }

    public int getTotalRecord(String keyword){
        return TripDBManager.getTotalRecord(keyword);
    }

    public int getTotalPreSavedRecord(String keyword){
        return TripDBManager.getTotalPreSavedRecord(keyword);
    }

    public List<TripVO> findAll(HashMap<String, Object> map){
        return TripDBManager.findAll(map);
    }

    public List<TripVO> findAllByAdmin(HashMap<String, Object> map){
        return TripDBManager.findAllByAdmin(map);
    }

    public List<ImgVO> findTripImg(int no){
        return TripDBManager.findTripImg(no);
    }

    public int insertTripImg(ImgVO imgVO){
        return TripDBManager.insertTripImg(imgVO);
    }

    public int deleteTripImg(int tripNo){
        return TripDBManager.deleteTripImg(tripNo);
    }

    public int updateTripLiked(int tripNo){
        return TripDBManager.updateTripLiked(tripNo);
    }

    public int updateTripNoLiked(int tripNo){
        return TripDBManager.updateTripNoLiked(tripNo);
    }
    
//    public String getRegionByTripNo(int tripNo) {
//    	return TripDBManager.getRegionByTripNo(tripNo);
//    }
    
}