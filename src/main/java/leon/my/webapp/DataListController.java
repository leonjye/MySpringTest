package leon.my.webapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DataListController {

	private static final Logger logger = LoggerFactory.getLogger(DataListController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/datalist", method = { RequestMethod.POST })
	public ModelAndView getList(Model model) {
		logger.debug("DataListController getList called!!!!");
		ModelAndView mv = new ModelAndView("datalist", model.asMap());
		return mv;
	}
}
