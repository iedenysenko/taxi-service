package taxiservice.controller.driver;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import taxiservice.lib.Injector;
import taxiservice.service.DriverService;

public class DeleteDriverController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("taxiservice");
    private final DriverService driverService = (DriverService) injector
            .getInstance(DriverService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        driverService.delete(Long.parseLong(req.getParameter("id")));
        resp.sendRedirect("/drivers/all");
    }
}
