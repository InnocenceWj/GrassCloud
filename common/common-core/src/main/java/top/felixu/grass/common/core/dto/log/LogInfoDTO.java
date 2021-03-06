package top.felixu.grass.common.core.dto.log;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * log 前端交互的实体
 *
 * @author felixu
 * @date 2019.07.17
 */
@Data
public class LogInfoDTO {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 来源服务名
     */
    private String serverName;

    /**
     * 操作描述
     */
    private String action;

    /**
     * 请求的方法
     */
    private String method;

    /**
     * 请求的类
     */
    private String target;

    /**
     * 请求参数
     */
    private String parameters;

    /**
     * 请求ip
     */
    private String ip;

    /**
     * 请求uri
     */
    private String url;

    /**
     * 请求头
     */
    private String httpHeaders;

    /**
     * 请求方式
     */
    private String httpMethod;

    /**
     * 请求返回
     */
    private String response;

    /**
     * 请求时间
     */
    private LocalDateTime requestTime;

    /**
     * 请求响应时间
     */
    private LocalDateTime responseTime;

    /**
     * 请求时长
     */
    private Long duration;

    /**
     * 请求错误信息
     */
    private String error;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 更新人
     */
    private Long updateBy;
}
