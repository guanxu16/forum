package com.forum.mapper;

import com.forum.dto.Page;
import com.forum.model.Post;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface PostMapper {


    List<Post> listPostByUid(int uid);

    int insertPost(Post post);

    List<Post> listPostByTime(@Param("offset") int offset, @Param("limit") int limit);

    int selectPostCount();

    Post getPostByPid(int pid);

    void updateReplyCount(int pid);

    void updateScanCount(int pid);

    void updateReplyTime(int pid);

    int getUidByPid(int pid);

    String getTitleByPid(int pid);

    List<Post> listPagePostByTid(@Param("map")Map<String,Object> paramMap,@Param("page") Page page);

}
