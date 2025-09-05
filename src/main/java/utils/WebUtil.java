package utils;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
public class WebUtil {

    private static final List<String> DEVICES =
            List.of("Android", "iPhone", "iPad", "Windows", "Macintosh", "Linux");

    private final HttpServletRequest request;
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
    public String getClientIpAddress() {
        String xForwardedForHeader = Objects.requireNonNullElse(getHeader("X-Forwarded-For"), request.getRemoteAddr());
        return xForwardedForHeader.split(",")[0].trim();
    }

    private String getHeader(String headerName) {
        return request.getHeader(headerName);
    }

    public String getHost() {
        return getHeader("Host");
    }

    public String getUserAgent() {
        return getHeader("User-Agent");
    }
    public String getBody() throws IOException {
        return new String(request.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
    }
}
