package ${package}.controller;

import ${package}.entity.Cart;
import ${package}.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    @Autowired
    private CartRepository cartRepository;

    @GetMapping(path = "/carts", produces = {"application/json"})
    public @ResponseBody
    Iterable<Cart> getAllCarts()
    {
        return cartRepository.findAll();
    }

    @GetMapping(path = "/cart", produces = {"application/json"})
    public @ResponseBody Cart getCartById(@RequestParam String id)
    {
        System.out.println(id);
        return cartRepository.findOne(id);
    }

    @PostMapping(path = "/cart", produces = {"application/json"}, consumes = {"application/json"})
    public @ResponseBody Cart getCartById(@RequestBody Cart cart)
    {
        System.out.println(cart);
        return cartRepository.save(cart);
    }
}
