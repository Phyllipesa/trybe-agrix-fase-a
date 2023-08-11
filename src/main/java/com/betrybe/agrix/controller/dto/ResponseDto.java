package com.betrybe.agrix.controller.dto;

/**
 * Create the Response dto.
 *
 * @param message Response message
 * @param data Response data
 */
public record ResponseDto<T>(T data, String message) {
}
