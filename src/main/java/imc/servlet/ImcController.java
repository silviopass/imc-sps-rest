package imc.servlet;

import Java.imc.model.ImcModel;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/imc-sps-res")
public class ImcController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String altura = req.getParameter("altura");
		String peso = req.getParameter("peso");
		String sexo = req.getParameter("sexo");
		String resultado = "";
		
		if (altura != null && peso != null) {
			resultado = ImcModel.resultadoImc(altura, peso, sexo);
		} else {
			resultado = "<h1>Informe os valores para calcular o IMC</h3>";
		}
		
		req.setAttribute("resultado", resultado);
		
		String nextJsp = "/index.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJsp);
		dispatcher.forward(req, res);
	}
}