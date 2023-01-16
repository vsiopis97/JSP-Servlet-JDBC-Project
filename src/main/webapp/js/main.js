$(document).ready(function() {
	var counter = 0;
	var userContainer = $("#user-info");
	var btn = $("#btn");


	btn.click(function() {
		var ourRequest = new XMLHttpRequest();
		ourRequest.open('GET', 'http://localhost:8080/EDWebApplication/api/users/');
		ourRequest.onload = function() {
			var ourData = JSON.parse(ourRequest.responseText);
			renderHTML(ourData);

		};
		ourRequest.send();
		counter++;
		if (counter > 9) {
			$("button").hide();
		}
	});

	function randomIntFromInterval(min, max) {
		return Math.floor(Math.random() * (max - min + 1) + min)
	}

	function renderHTML(data) {
		var htmlString = "";
		var r = randomIntFromInterval(0, data.length - 1);
		htmlString = "<p>" + data[r].firstName + " " + data[r].surname + " - " + data[r].gender + " - " + data[r].birthdate + " - " + data[r].address.workAddress + " - " + data[r].address.homeAddress + "</p>"
		userContainer.append(htmlString);
	}
});