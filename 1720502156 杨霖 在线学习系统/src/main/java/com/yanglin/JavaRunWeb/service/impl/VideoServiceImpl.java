package com.yanglin.JavaRunWeb.service.impl;

import java.util.List;

import com.yanglin.JavaRunWeb.mapper.VideoMapper;
import com.yanglin.JavaRunWeb.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanglin.JavaRunWeb.model.Video;

@Service("videoService")
public class VideoServiceImpl implements VideoService {
	@Autowired
	private VideoMapper videoMapper;


	@Override
	public List<Video> selectVideos() {
		return videoMapper.selectVideos();
	}


	@Override
	public boolean addVideo(String videoName, String videoTime, String videoSrc) {
		if(videoMapper.addVideo(videoName, videoTime, videoSrc)>0) {
			return true;
		}else {
			return false;
		}
	}


	@Override
	public int delVideo(int videoId) {
		
		return videoMapper.delVideo(videoId);
	}


	@Override
	public String selectVideoSrc(int videoId) {
		return videoMapper.selectVideoSrc(videoId);
	}


	@Override
	public Video selectVideo(int videoId) {
		return videoMapper.selectVideo(videoId);
	}


	@Override
	public int updateVideo(String videoName, String videoTime, String videoSrc,int videoId) {
		return videoMapper.updateVideo(videoName, videoTime, videoSrc,videoId);
	}

	
}
