package com.atguigu.gmall.pms.service.impl;

import com.atguigu.gmall.pms.entity.AlbumPic;
import com.atguigu.gmall.pms.mapper.AlbumPicMapper;
import com.atguigu.gmall.pms.service.AlbumPicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 画册图片表 服务实现类
 * </p>
 *
 * @author xcl
 * @since 2020-04-07
 */
@Component
@com.alibaba.dubbo.config.annotation.Service
public class AlbumPicServiceImpl extends ServiceImpl<AlbumPicMapper, AlbumPic> implements AlbumPicService {

}
