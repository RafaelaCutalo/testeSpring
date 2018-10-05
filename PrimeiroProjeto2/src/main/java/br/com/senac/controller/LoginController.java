//package br.com.senac.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
////
//import br.com.senac.servico.CategoriaService;
//import br.com.senac.servico.LoginService;
//
//
//@Controller
//public class LoginController {
//	
//	@Autowired
//	private LoginService categoriaService;
//	
//	@GetMapping("/listarLogin")
//	public ModelAndView listaLogin() {
//		ModelAndView mv = new ModelAndView("/paginaLogin");
//		mv.addObject("login", loginService.listalogin());
//		return mv;
//
//	}
//}


//package br.com.senac.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import br.com.senac.dominio.Aluno;
////
//import br.com.senac.servico.CategoriaService;
//import br.com.senac.servico.LoginService;
//
//
//@Controller
//public class LoginController {
//	
//	@Autowired
//	private LoginService categoriaService;
//	
//	@GetMapping("/listarA")
//	public ModelAndView listaLogin() {
//		ModelAndView mv = new ModelAndView("/paginaLogin");
//		mv.addObject("login", loginService.listalogin());
//		return mv;
//
//	}
//	
//	@RequestMapping(method = RequestMethod.GET, value ="/cadastrarpessoa")
//	public ModelAndView inicio( ) {
//		ModelAndView modelAndView = new modelAndView("cadastro/cadastropessoa");
//		modelAndView.addObject("pessoabj", new Pessoa());
//		return ModelAndView;
//	}
//	
//	@RequestMapping(method = RequestMethod.POST, value ="/salvarpessoa")
//	public ModelAndView salvar(Aluno aluno ) {
//		Object alunoRepository;
//		alunoRepository.save(aluno);
//	}
//}




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//
//import br.com.senac.servico.CategoriaService;
import br.com.senac.servico.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/listarLogin")
	public ModelAndView listaLogin() {
		ModelAndView mv = new ModelAndView("/paginaLogin");
		mv.addObject("login", loginService.listaLogin());
		return mv;
	}
	
}


// (segunda tentativa)
//package br.com.senac.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import br.com.senac.dominio.LoginForm;
//import br.com.senac.servico.CategoriaService;



//@Controller
//public class LoginController {
//	
//	@RequestMapping(value="/login", method=RequestMethod.GET)
//	public String getLoginForm() {
//		return "login";
//		
//	}
//	
//	@RequestMapping(value="/login", method=RequestMethod.POST)
//	private String login(@ModelAttribute(name="loginForm")LoginForm loginForm, Model model) {
//		
//		String username = loginForm.getUsername();
//		String senha = loginForm.getSenha();
//		
//		if("admin".equals(username) && "admin".equals(senha)) {
//			return "home";
//		}
//		
//		model.addAttribute("invalidCredentials", true);
//		return "login";
//	}
//}
//



























