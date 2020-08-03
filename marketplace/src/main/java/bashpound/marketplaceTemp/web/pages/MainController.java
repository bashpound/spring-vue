package bashpound.marketplaceTemp.web.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping(value = { "/", "/loginpage", "/register" })
  public String entry() {
    return "index";
  }

}
