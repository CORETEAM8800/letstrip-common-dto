package utils;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;

/**
 * Utility class for extracting information from an {@link jakarta.servlet.http.HttpServletRequest}.
 * Provides methods to get device type, client IP address, host, user agent, and request body.
 */
@RequiredArgsConstructor
public class WebUtil {

    /**
     * List of device keywords to identify device type from User-Agent header.
     */
    private static final List<String> DEVICES =
            List.of("Android", "iPhone", "iPad", "Windows", "Macintosh", "Linux");

    private final HttpServletRequest request;

    /**
     * Determines the device type based on the User-Agent header.
     *
     * @return the device type if matched, otherwise "Unknown"
     */
    public String getDeviceType() {
        String userAgent = getUserAgent();
        if (userAgent != null) {
            return DEVICES.stream()
                    .filter(userAgent::contains)
                    .findAny()
                    .orElse("Unknown");
        }
        return "Unknown";
    }

    /**
     * Retrieves the client IP address from the request.
     * Checks the X-Forwarded-For header first, then falls back to remote address.
     *
     * @return the client IP address
     */
    public String getClientIpAddress() {
        String xForwardedForHeader = Objects.requireNonNullElse(getHeader("X-Forwarded-For"), request.getRemoteAddr());
        return xForwardedForHeader.split(",")[0].trim();
    }

    /**
     * Gets the value of a specific header from the request.
     *
     * @param headerName the name of the header
     * @return the header value, or null if not present
     */
    private String getHeader(String headerName) {
        return request.getHeader(headerName);
    }

    /**
     * Retrieves the Host header from the request.
     *
     * @return the host value, or null if not present
     */
    public String getHost() {
        return getHeader("Host");
    }

    /**
     * Retrieves the User-Agent header from the request.
     *
     * @return the user agent string, or null if not present
     */
    public String getUserAgent() {
        return getHeader("User-Agent");
    }

    /**
     * Reads the request body as a UTF-8 string.
     *
     * @return the request body
     * @throws IOException if an I/O error occurs
     */
    public String getBody() throws IOException {
        return new String(request.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
    }
}