package JavaProjectMovie;



import JavaProjectMovie.Film;
import JavaProjectMovie.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @Autowired
    FilmRepository fr;

    public MyController() {
    }

    @RequestMapping({"/direct"})
    @ResponseBody
    String directExample() {
        return "Hello World!";
    }

    @RequestMapping({"/bar"})
    String anyMethodName() {
        return "foo";
    }

    @RequestMapping({"/filmList"})
    public String ex(Model model) {
        model.addAttribute("filmList", this.fr.findAll());
        return "films";
    }

    @RequestMapping({"/addfilm"})
    public String addFilm() {
        return "addfilm";
    }

    @RequestMapping(
            value = {"/processfilm"},
            method = {RequestMethod.POST}
    )
    public String processForm(Film film) {
        this.fr.save(film);
        return "redirect:/filmList";
    }
}
