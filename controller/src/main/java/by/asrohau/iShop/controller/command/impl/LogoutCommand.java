package by.asrohau.iShop.controller.command.impl;

import by.asrohau.iShop.controller.command.Command;
import by.asrohau.iShop.controller.exception.ControllerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogoutCommand implements Command{
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ControllerException {
        System.out.println("We got to LogoutCommand");

        request.getSession().invalidate();
        String goToPage = "index.jsp";
        try {
            request.getRequestDispatcher(goToPage).forward(request, response);
        } catch (IOException | ServletException e) {
            throw new ControllerException(e);
        }
    }
}
