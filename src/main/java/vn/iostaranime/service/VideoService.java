package vn.iostaranime.service;

import vn.iostaranime.entity.Video;

import java.util.List;

public interface VideoService {
    List<Video> findAll();
    Video save(Video entity);
    void deleteById(int id);
    List<Video> search(String keyword);
    Video findById(int id);
}
