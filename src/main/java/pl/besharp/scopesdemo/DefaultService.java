package pl.besharp.scopesdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class DefaultService {

	private final InjectableComponent myDependence;
	private int counter;
	private static int scounter;
	public DefaultService(InjectableComponent myDependence) {
		this.myDependence = myDependence;
		scounter++;
		counter = scounter;
	}

	@Async
	public void call() {
		myDependence.call(counter);
	}
}
