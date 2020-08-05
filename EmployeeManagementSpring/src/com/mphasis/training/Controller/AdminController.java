package com.mphasis.training.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.mphasis.training.BuisnessException.BuisnessException;
import com.mphasis.training.Entity.Job;
import com.mphasis.training.Service.EmployeeBoImp;


@Controller
public class AdminController {

	@Autowired
	EmployeeBoImp employeeBo;
	
	@RequestMapping("/employee")
	public ModelAndView getEmployees() {
		ModelAndView mv = new ModelAndView();
		try {
			mv.addObject("EmployeeList", employeeBo.retriveAllEmployee());
			mv.setViewName("employee");
		} catch (BuisnessException e) {
            mv.addObject("error", e.getMessage());
			mv.setViewName("employee");
		}
		return mv;
	}
	
	@RequestMapping("/AddJob")
	public String AddJob(Model model) {
		model.addAttribute("job",new Job());
         return "AddJob";
	}
	
	@RequestMapping(value="/AddJob", method = RequestMethod.POST)  
    public String addEMployee(@ModelAttribute Job job,Model model){  
        System.out.println("add employee called");  
         employeeBo.addJob(job); 
         return "AddJob";    
    }
	
	
}
