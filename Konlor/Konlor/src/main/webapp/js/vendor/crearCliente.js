(function ($) {
    var getUrlParameter = function getUrlParameter(sParam) {
        var sPageUrl = decodeURIComponent(window.location.search.substring(1)),
                sURLVariables = sPageUrl.split('&'),
                sParameterName,
                i;
        for (var i = 0; i < sURLVariables.length; i++) {
            sParameterName = sURLVariables[i].split('=');
            if (sParameterName[0] === sParam) {
                return sParameterName[1] === undefined ? true : sParameterName[1];
            }
        }
    };

    if (getUrlParameter('id')) {
        $.ajax({
            url: '/konlor/api/clienteId/' + getUrlParameter('id'),
            contentType: 'application/json',
            method: 'GET',
            dataType: 'json'
        }).done(function (data) {
            var nom_cliente = $('#nom_cliente').val(data.nomCliente);
            var cedula_cliente = $('#cedula_cliente').val(data.CedulaCliente);
            var edad_cliente = $('#edad_cliente').val(data.edadCliente);
            var id = data.id;

            $('#botonCrear').text('Actualizar Cliente').click(function (event) {
                var nom_cliente = $('#nom_cliente').val();
                var cedula_cliente = $('#cedula_cliente').val();
                var edad_cliente = $('#edad_cliente').val();

                $.ajax({
                    url: '/konlor/api/clienteId/' + id,
                    contentType: 'application/json',
                    data: JSON.stringify({
                        nomCliente: nom_cliente,
                        CedulaCliente: cedula_cliente,
                        edadCliente: edad_cliente,
                        id: id
                    }),
                    method: 'PUT',
                    dataType: 'json'
                }).done(function (data) {
                    window.location.href = '/konlor';
                }).fail(function (xhr, status, error) {
                    console.log(error);
                });
            })
        }).fail(function (xhr, status, error) {
            console.log(error);
        });
    } else {
        $('#botonCrear').click(function (event) {
            var nom_cliente = $('#nom_cliente').val();
            var cedula_cliente = $('#cedula_cliente').val();
            var edad_cliente = $('#edad_cliente').val();
            $.ajax({
                url: '/konlor/api/clienteId/',
                contentType: 'application/json',
                data: JSON.stringify({
                    nomCliente: nom_cliente,
                    CedulaCliente: cedula_cliente,
                    edadCliente: edad_cliente
                }),
                method: 'POST',
                dataType: 'json'
            }).done(function (data) {
                window.location.href = '/konlor';
            }).fail(function (xhr, status, error) {
                console.log(error);
            });
        });
    }


})(jQuery);