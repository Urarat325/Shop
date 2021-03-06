import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export default new Vuex.Store({
    state: {
        IndexCat: 0,
        IndexSubCat: 0,
        Output: 0,
        HeaderText: "Саженцы",
    },
    mutations: {
        setIDCatAndSubCat(state, payload) {
            state.IndexSubCat = payload.indexSubCat;
            state.IndexCat = payload.indexCat;
            state.Output = 1;
        },
        setIDCat(state, payload) {
            state.IndexCat = payload.indexCat;
        },
        setIDSubCat(state, payload) {
            state.IndexSubCat = payload.indexSubCat;
        },
        setOutput(state, payload) {
            state.Output = payload.Output
        },
        setHeaderText(state, payload) {
            state.HeaderText = payload.HeaderText;
        }
    },
    actions: {},
    getters: {
        IDCat: state => state.IndexCat,
        IDSubCat: state => state.IndexSubCat,
        Output: state => state.Output,
        HeaderText: state => state.HeaderText,
    },
    modules: {}
});
